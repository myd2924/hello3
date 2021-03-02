package com.myd.hello3.service.impl;

import com.myd.hello3.pojo.User;
import com.myd.hello3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/2/24 14:53
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void saveUser(User user) {
        mongoTemplate.save(user,"user");
    }

    @Override
    public User getUser(Long id) {
        return mongoTemplate.findById(id,User.class);
        //如果获取第一个  也可以采用如下方法
        /*Criteria criteria = Criteria.where("id").is(id);
        Query query = Query.query(criteria);
        return mongoTemplate.findOne(query,User.class);*/
    }

    @Override
    public List<User> getUserList() {
        return mongoTemplate.findAll(User.class);
    }
}
