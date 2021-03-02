package com.myd.hello3.repository;

import com.myd.hello3.pojo.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/2/24 15:03
 * @Description: TODO
 */
@Repository
public interface UserRepository extends MongoRepository<User,Long> {
    List<User> findByUserNameLike(String name);

    @Query("{'id':?0,'userName':?1}")
    User findOne(Long id,String userName);
}
