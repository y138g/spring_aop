package com.itgr.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    public void add(){
        System.out.println("用户新增");
    }
    public void delete(){
        System.out.println("用户删除");
    }
    public void update(){
        System.out.println("用户修改");
    }
}
