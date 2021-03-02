package com.myd.hello3.service;

import com.myd.hello3.pojo.User;

import java.util.List;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/2/24 14:51
 * @Description:
 */
public interface UserService {
    void saveUser(User user);
    User getUser(Long id);

    List<User> getUserList();
}
