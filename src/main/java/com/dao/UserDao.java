package com.dao;

import java.util.List;
import java.util.Map;

import com.model.Users;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;


public interface UserDao {
     public void addUser(@Param("user") Users user);
}
