package com.chenxy.dao;

import com.chenxy.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;
/**
 * Created by admin on 2016/10/27.
 */
public interface IUserDao extends PagingAndSortingRepository<User, Long> {

}
