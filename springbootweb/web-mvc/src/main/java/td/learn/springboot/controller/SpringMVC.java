package td.learn.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import td.learn.springboot.model.User;

@Controller
@RequestMapping("/demo1")
public class SpringMVC {



    @Autowired
    private User user;

    @RequestMapping("/user")
    @ResponseBody
    public User getUser(){

        return user;
    }




}
