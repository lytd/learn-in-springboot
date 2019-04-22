package td.learn.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import td.learn.springboot.model.User;

@Controller
@RequestMapping("/requestParam")
public class RequestParamDemoController {

    @Autowired
    private User user;

    @RequestMapping("/getUserByName")
    @ResponseBody
    public User getUserByName(@RequestParam(name="username",required = false,defaultValue = "empty")String name){
        user.setName(name);
        return user;
    }

    @RequestMapping("/getUserByName1")
    @ResponseBody
    public User getUserByName1(@RequestParam(name="username",required = false)String name){
        user.setName(name);
        return user;
    }


    @RequestMapping("/getUserAndHeader")
    @ResponseBody
    public User getUserAndHeader(@RequestParam(name="username")String name, @RequestHeader("User-Agent")String headers){
        user.setName(name);
        user.setRemark(headers);
        return user;
    }


    @RequestMapping("/getUserRequest")
    @ResponseBody
    public ResponseEntity<User> getUserAndHeader(RequestEntity<String> requestEntity){
        System.out.println("request body : " + requestEntity.getBody());
        HttpHeaders headers = requestEntity.getHeaders();
        System.out.println("request headers : " + headers);
        HttpMethod method = requestEntity.getMethod();
        System.out.println("request method : " + method);
        System.out.println("request url: " + requestEntity.getUrl());

        ResponseEntity<User> responseEntity = new ResponseEntity<>(user,
                HttpStatus.OK);

        return responseEntity;
    }

    @RequestMapping(path="/getUserRequestBody",method = RequestMethod.POST )
    @ResponseBody
    public User getUserRequestBody(@RequestBody String u1){
        System.out.println(u1);
        return user;
    }





}
