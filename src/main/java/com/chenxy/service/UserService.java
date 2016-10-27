package com.chenxy.service;

import com.chenxy.dao.IUserDao;
import com.chenxy.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by admin on 2016/10/27.
 */
@Service
public class UserService {


    @Resource
    private IUserDao iUserDao;

    public Page<User> checkUser(PageRequest page){
         return iUserDao.findAll(page);
    }
}


