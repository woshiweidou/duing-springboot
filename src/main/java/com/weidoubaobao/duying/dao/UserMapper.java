package com.weidoubaobao.duying.dao;

import com.weidoubaobao.duying.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    List<User> queryAll();
    void insertUser(User user);
}
