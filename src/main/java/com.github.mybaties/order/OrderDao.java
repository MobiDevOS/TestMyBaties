package com.github.mybaties.order;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class OrderDao {

    private static SqlSessionFactory mSqlFactory;

    static{
        String resource = "conf.xml";
        //加载mybatis的配置文件（它也加载关联的映射文件）
        try {
            Reader reader = Resources.getResourceAsReader(resource);
            mSqlFactory =  new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Order selectOrderFromId(int id){
        SqlSession mSession = mSqlFactory.openSession(true);
        String statement = "com.github.mybaties"+".selectOrderResultMap";
        Order mOrder =  mSession.selectOne(statement,id);
        return mOrder;
    }
}
