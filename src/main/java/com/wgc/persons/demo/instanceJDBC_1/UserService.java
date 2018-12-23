package com.wgc.persons.demo.instanceJDBC_1;

import com.wgc.persons.demo.dao.UsersDAO;
import com.wgc.persons.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UsersDAO usersDAO;

    public User queryName(String name) {
        User byName = usersDAO.findByName(name);
        return byName;
    }

    public List<User>  userList() {
        List<User> all = usersDAO.findAll();
        return all;
    }
}
