package com.icepoint.restful.service;

import java.util.List;

import com.icepoint.restful.pojo.User;

public interface UserService {
    /**
     * @param user
     * @return
     */
    boolean addUser(User user);
    /**
     * @param user
     * @return
     */
    boolean updateUser(User user);
    /**
     * @param id
     * @return
     */
    boolean deleteUser(int id);
    /**
     * @param userName
     */
    User findUserByName(String userName);
    /**
     * @return
     */
    List<User> findAll();
}
