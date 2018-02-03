package com.github.mybaties;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class UserDao {
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

    public void insertUser(User mUser){
        //自动提交事务 不用主动去commit
        SqlSession mSession = mSqlFactory.openSession(true);
        String statement = "com.github.mybaties"+".insertUser";
        //执行插入方法
        mSession.insert(statement,mUser);
        mSession.close();
    }

    public User selectUserById(int userId){
        //自动提交事务 不用主动去commit
        SqlSession mSession = mSqlFactory.openSession(true);
        String statement = "com.github.mybaties"+".selectUserById";
        //执行查找方法
        User mUser = mSession.selectOne(statement,userId);
        mSession.close();
        return mUser;
    }

    public void deleteUserById(String userId){
        //自动提交事务 不用主动去commit
        SqlSession mSession = mSqlFactory.openSession(true);
        String statement = "com.github.mybaties"+".selectUserById";
        //执行插入方法
        mSession.delete(statement);
        mSession.close();
    }

    public List<User> selectAll(){
        //自动提交事务 不用主动去commit
        SqlSession mSession = mSqlFactory.openSession(true);
        String statement = "com.github.mybaties"+".selectAll";
        //执行插入方法
        List<User> mList = mSession.selectList(statement);
        mSession.close();

        return mList;
    }



}
