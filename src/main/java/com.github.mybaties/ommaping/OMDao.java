package com.github.mybaties.ommaping;

import com.github.mybaties.oomaping.Class;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class OMDao {

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

    //多个sql的多次查询
    public Classes slectClassInfoByClassIdMulitSql(int id){
        SqlSession mSession = mSqlFactory.openSession(true);
        String statement = "com.github.mybaties.ommaping"+".getClasses4";
        Classes mClass =  mSession.selectOne(statement,id);
        return mClass;
    }

    //一个sql的联合查询
    public Classes slectClassInfoByClassIdSql(int id){
        SqlSession mSession = mSqlFactory.openSession(true);
        String statement = "com.github.mybaties.ommaping"+".getClasses3";
        Classes mClass =  mSession.selectOne(statement,id);
        return mClass;
    }
}
