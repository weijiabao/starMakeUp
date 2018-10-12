package com.icepoint.restful.web;

import java.util.List;

import com.icepoint.restful.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.icepoint.restful.pojo.User;
import com.icepoint.restful.service.UserService;

@RestController
@RequestMapping(value = "/api")
public class UserRestController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public boolean addUser(@RequestBody User user){
        System.out.println("Adding...");
        return userService.addUser(user);
    }

    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    public boolean updateUser(@RequestBody User user) {
    	System.out.println("Updating...");
        return userService.updateUser(user);
    }

    @RequestMapping(value = "/user", method = RequestMethod.DELETE)
    public boolean delete(@RequestParam(value = "userId", required = true) int userId) {
        System.out.println("Deleting...");
        return userService.deleteUser(userId);
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public User findByUserName(@RequestParam(value = "userName", required = true) String userName) {
    	System.out.println("Finding...");
        return userService.findUserByName(userName);
    }

    @RequestMapping(value = "/userAll", method = RequestMethod.GET)
    public List<User> findByUserAge() {
    	System.out.println("Finding All...");
        return userService.findAll();
    }

}
