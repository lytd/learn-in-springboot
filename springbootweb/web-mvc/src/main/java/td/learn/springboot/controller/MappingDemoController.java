package td.learn.springboot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import td.learn.springboot.model.User;

@Controller
@RequestMapping("/requestMapping")
public class MappingDemoController {

    @Autowired
    private User user;


    @RequestMapping(path = {"/user1","/getuser1"},method = {RequestMethod.GET})
    @ResponseBody
    public User getUser1(){
        user.setRemark("getUser1()");
        return user;

    }


    @RequestMapping(path = {"/params"},method = {RequestMethod.GET},params = {"age=12","name=tom"})
    @ResponseBody
    public User getParams(){
        user.setRemark("params()");

        return user;

    }


    @RequestMapping(path = {"/header"},method = {RequestMethod.GET},headers = {"Accept=application/json"})
    @ResponseBody
    public User getHeader(){
        user.setRemark("header()");

        return user;

    }


    @RequestMapping(path = {"/body"},method = {RequestMethod.GET}
    ,consumes = {"application/xml"},produces = {"application/json"}
    )
    @ResponseBody
    public User getRespon(){
        user.setRemark("body()");

        return user;

    }


    @RequestMapping("/path/{pathName}")
    @ResponseBody
    public User getRespon(@PathVariable("pathName") String name){
        user.setRemark("pathname:"+name);

        return user;

    }



}
