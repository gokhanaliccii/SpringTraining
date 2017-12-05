package com.gokhanaliccii.rest.controller;

import com.gokhanaliccii.rest.LocalRepository;
import com.gokhanaliccii.rest.Repository;
import com.gokhanaliccii.rest.WebRepository;
import com.gokhanaliccii.rest.model.User;
import com.gokhanaliccii.rest.model.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


@org.springframework.web.bind.annotation.RestController()
@RequestMapping("/basic")
public class BasicController extends Object {

    @Autowired
    UserDao userDao;

    private Repository<String> repo;

    public BasicController() {
        repo = new LocalRepository();
        repo = new WebRepository();
    }

    @RequestMapping("/getName")
    public String getName(String a) {

        User user = new User();
        user.setName("gokhan");
        user.setSurname("alıcı");
        userDao.save(user);

        return "name";
    }

}