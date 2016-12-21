package com.marsthink.service;

import com.marsthink.bean.User;
import com.marsthink.dao.UserDao;
import com.marsthink.entity.UserInfo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by qiuye on 16/9/9.
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    private static final Logger logger = Logger.getLogger(UserService.class);

    public UserInfo getName(String nickName) {
        logger.info(nickName);
        return userDao.getUserName(nickName);
    }

}
