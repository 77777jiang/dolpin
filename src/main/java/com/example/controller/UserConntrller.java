/*
package com.example.controller;

import com.alibaba.fastjson.JSON;
import com.example.domain.UserBean;
import com.example.pojo.UserPojo;
import com.example.service.IService.IUserService;
import com.example.service.serviceImp.UserServivceImp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

@Controller
@RequestMapping("/user")
public class UserConntrller {

    @RequestMapping(value = "/checkUser",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public String checkUser(HttpServletRequest request){
        try {
            request.setCharacterEncoding( "utf-8" );
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String username = request.getParameter( "username" );
        UserBean userBean = new UserBean();
        userBean.setName( username );
        IUserService userService = new UserServivceImp();
        UserPojo userPojo = userService.findUser( userBean );

        return JSON.toJSONString( userPojo );

    }
}
*/
