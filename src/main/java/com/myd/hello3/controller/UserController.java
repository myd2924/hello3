package com.myd.hello3.controller;

import com.myd.hello3.form.ValidateForm;
import com.myd.hello3.pojo.User;
import com.myd.hello3.repository.UserRepository;
import com.myd.hello3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/2/24 14:45
 * @Description:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/save")
    public User saveUser(User user){
        userService.saveUser(user);
        return user;
    }

    @GetMapping("/get")
    public User getUser(Long id){
        User user = userService.getUser(id);
        return user;
    }

    @GetMapping("/userList")
    public List<User> getUserList(){
        List<User> list = userService.getUserList();
        return list;
    }

    @GetMapping("/findByName")
    public List<User> getUserList(String name){
        List<User> userList = userRepository.findByUserNameLike(name);
        return userList;
    }


    @GetMapping("/findByIdOrName")
    public User getUserList(Long id,String name){
        User user = userRepository.findOne(id,name);
        return user;
    }

    @RequestMapping(value = "/postValidate",method = RequestMethod.POST)
    public Object testValidate(@Valid @RequestBody ValidateForm form){
        System.out.println(form.getName());
        System.out.println(form.getNum());
        return form;
    }
}
