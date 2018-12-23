package com.wgc.persons.demo;

import com.wgc.persons.demo.hibernate.SpringHibernateConfig;
import com.wgc.persons.demo.entity.User;
import com.wgc.persons.demo.instanceJDBC_1.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class JdbcOperationsTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringHibernateConfig.class);
        UserService bean = context.getBean(UserService.class);
        List<User> users = bean.userList();
        System.out.println(users);
    }
}
