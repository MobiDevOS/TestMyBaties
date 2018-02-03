package com.github.mybaties;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class UserDaoWithInterfaceMapping {

    private static SqlSessionFactory mSqlFactory;

    static{
        String resource = "confWithoutMapper.xml";
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
        IUserMapper mapper = mSession.getMapper(IUserMapper.class);
        mapper.insertUser(mUser);
        mSession.close();
    }


    public User getUserByKey(String name,String id){
        //自动提交事务 不用主动去commit
        SqlSession mSession = mSqlFactory.openSession(true);
        IUserMapper mapper = mSession.getMapper(IUserMapper.class);
        User mUser = mapper.selectAllUserByFilter(id,name);
        mSession.close();
        return mUser;
    }


    public  List<User> selectAll(){
        //自动提交事务 不用主动去commit
        SqlSession mSession = mSqlFactory.openSession(true);
        IUserMapper mapper = mSession.getMapper(IUserMapper.class);
        List<User> mUser = mapper.selectAllUser();
        mSession.close();
        return mUser;
    }

}
