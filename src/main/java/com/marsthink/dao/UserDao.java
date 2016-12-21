package com.marsthink.dao;

import com.marsthink.bean.User;

import com.marsthink.entity.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created by guan on 16/9/13.
 */
@Repository
public interface UserDao {
    String SELECT_KEY = " name,age,date ";

    String TABLE_NAME = "user";

    @Select(" select " + SELECT_KEY + " from " + TABLE_NAME + " where name=#{name} limit 1")
    UserInfo getUserName(@Param("name") String name);
}
