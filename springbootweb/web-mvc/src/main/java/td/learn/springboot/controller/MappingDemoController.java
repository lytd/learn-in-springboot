package td.learn.springboot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import td.learn.springboot.model.User;

@Controller
@RequestMapping("/requestMapping")
public class MappingDemoController {

    @Autowired
    private User user;


   // @RequestMapping(method = HttpMethod.GET)
    public User getUser1(){
        return user;

    }
}
