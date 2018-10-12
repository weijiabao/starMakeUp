package com.icepoint.restful.mapper;

import java.util.List;

import org.apache.ibatis.annotations.*;

import com.icepoint.restful.pojo.User;

public interface UserMapper {

    @Insert("insert into t_user(id, name, age) values (#{id}, #{name}, #{age})")
    void addUser(User user);

    @Update("update t_user set name=#{name},age=#{age} where id=#{id}")
    void updateUser(User user);

    @Delete("delete from t_user where id=#{id}")
    void deleteUser(int id);

    @Select("SELECT id,name,age FROM t_user where name=#{userName}")
    User findByName(String userName);

    @Select("SELECT id,name,age FROM t_user")
     List<User> findAll();
}
