package com.wgc.persons.demo.dao;

import com.wgc.persons.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


/*生成了一个自动的代理*/
public interface UsersDAO extends JpaRepository<User, Integer> {
    /*按照驼峰命名法的规矩来By后面的是sql语句的条件*/
    /*find或get开头的是查询的意思*/
    User findByName(String name);
}
