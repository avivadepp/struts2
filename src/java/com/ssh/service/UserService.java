package com.ssh.service;

/**
 * @program: struts2
 * @description:
 * @autor:
 * @rewrite: Aviva Wang
 * @create: 2019-01-30-36
 **/

import com.ssh.model.User;

public interface UserService {

    User getUser(Integer uid);

    void saveUser(User user);
}