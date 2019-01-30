package com.ssh.dao;

/**
 * @program: struts2
 * @description:
 * @autor:
 * @rewrite: Aviva Wang
 * @create: 2019-01-30-28
 **/
import com.ssh.model.User;

public interface UserDao {

    User getUser(Integer uid);

    void saveUser(User user);
}
