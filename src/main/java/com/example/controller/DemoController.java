package com.example.controller;

import com.alibaba.fastjson.JSON;
import com.example.domain.UserBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.jws.soap.SOAPBinding;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/test")
    public String index(){
        return "test";
    }

    @RequestMapping("/jsp")
    public String getJsp(){
        return "testing";
    }

    @RequestMapping(value = "/json",method = RequestMethod.POST,
            produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public String getJson() {
        UserBean userBean = new UserBean();
        userBean.setName( "张三" );
        userBean.setAge( 18 );
        userBean.setSex( "男" );
        return JSON.toJSONString( userBean );
    }

    @RequestMapping(value = "/tests",produces = {"application/json;charset=utf-8"})
    public @ResponseBody String returnJson(){
        UserBean user = new UserBean();
        user.setName( "王五" );
        user.setAge( 22 );
        user.setSex( "男" );
        return JSON.toJSONString( user );
    }

    @RequestMapping(value = "/test/{age}" ,method = RequestMethod.GET,
    produces = {"application/json;charset=utf-8"})
    public @ResponseBody String returnJson(@PathVariable int age){
        UserBean userbean = new UserBean();
        userbean.setName( "马六" );
        userbean.setAge( age );
        userbean.setSex( "男" );
        return JSON.toJSONString( userbean );
    }
    @RequestMapping(value = "/test/{name}/{age}",produces = "application/json;charset=utf-8")
    public @ResponseBody String jsonReturn(@PathVariable("name")String username,
                                           @PathVariable("age")int userage){
        UserBean bean = new UserBean();
        bean.setName( username );
        bean.setAge( userage );
        return JSON.toJSONString( bean );
    }


}
