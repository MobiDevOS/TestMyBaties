package com.github.mybaties;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IUserMapper {
    @Select("select * from users where id = #{id}")
    public User selectUserFromId(String id);

    @Select("select * from users")
    public List<User> selectAllUser();

    @Select("select * from users where id = #{arg0} and name = #{arg1} ")
    public User selectAllUserByFilter(String id,String name);

    @Insert("insert into users(name, age) values(#{name}, #{age})")
    public void insertUser(User mUser);


}
