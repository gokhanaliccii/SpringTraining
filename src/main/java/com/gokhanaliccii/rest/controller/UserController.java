package com.gokhanaliccii.rest.controller;

import com.gokhanaliccii.rest.model.User;
import com.gokhanaliccii.rest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@org.springframework.web.bind.annotation.RestController()
@RequestMapping("/user")
public class UserController extends Object {

    @Autowired
    UserRepository userRepo;

    @RequestMapping(value = "/find" ,method = RequestMethod.POST,headers="Accept=application/json" )
    public User getUser() {
        return userRepo.findOne(1l);
    }

    @RequestMapping(value = "/new" ,method = RequestMethod.POST,headers="Accept=application/json" )
    public User save() {
        User newUser = new User();
        newUser.setName("ali");
        User savedUser = userRepo.save(newUser);

        return savedUser;
    }


}