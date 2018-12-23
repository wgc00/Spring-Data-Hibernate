package com.wgc.persons.demo.entity;

import javax.persistence.*;

@Entity //标注是一个实体类
@Table(name = "p_user") //数据库的表
public class User {

    @Id
    @GeneratedValue //这是自动增长
    private int id;

    //@Column(name = "name")  //数据库的名字
    private String name;
    public User() {}
    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
