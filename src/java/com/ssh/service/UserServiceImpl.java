package com.ssh.service;

/**
 * @program: struts2
 * @description:
 * @autor:
 * @rewrite: Aviva Wang
 * @create: 2019-01-30-37
 **/
import com.ssh.dao.UserDao;
import com.ssh.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {

    //依赖Dao
    @Resource
    private UserDao userDao;
    // 注入事务管理
    @Transactional(rollbackFor={Exception.class, RuntimeException.class})
    public User getUser(Integer uid) {
        return userDao.getUser(uid);
    }

    @Transactional(rollbackFor={Exception.class, RuntimeException.class})
    public void saveUser(User user) {
        userDao.saveUser(user);
//        throw new RuntimeException();
//        userDao.saveUser(user);
    }
}