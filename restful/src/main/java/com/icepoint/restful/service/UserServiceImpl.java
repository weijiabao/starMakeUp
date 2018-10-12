package com.icepoint.restful.service;

import java.util.List;

import com.icepoint.restful.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icepoint.restful.pojo.User;

@Service(value = "UserService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean addUser(User user){
        boolean flag = false;
        try{
            userMapper.addUser(user);
            flag = true;
        }catch(Exception e){
            System.out.println("Add Failed!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean updateUser(User user){
        boolean flag = false;
        try{
            userMapper.updateUser(user);
            flag = true;
        }catch(Exception e){
            System.out.println("Update Failed!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean deleteUser(int id){
        boolean flag = false;
        try{
            userMapper.deleteUser(id);
            flag = true;
        }catch(Exception e){
            System.out.println("Delete Failed!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public User findUserByName(String userName){
        return userMapper.findByName(userName);
    }

    @Override
    public List<User> findAll(){
        return userMapper.findAll();
    }
}
