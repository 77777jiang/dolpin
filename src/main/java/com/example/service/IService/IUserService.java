package com.example.service.IService;

import com.example.domain.UserBean;
import com.example.pojo.UserPojo;

public interface IUserService {
    public UserPojo findUser(UserBean userBean);

}
