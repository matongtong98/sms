package com.briup.apps.sms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.briup.apps.sms.bean.User;
import com.briup.apps.sms.dao.UserDao;
import com.briup.apps.sms.service.Userservice;

/**
 * 用户逻辑逻辑处理的实现类
 * */  
@Service
public class UserServicelmpl implements Userservice {
	// 依赖注入，实例化UserDao并且赋值给userDao这个变量
	@Resource
	private UserDao userDao;

	public List<User> selectAll() {
		// TODO Auto-generated method stub
		return userDao.selectAll();
	}

	public void saveOrUpdate(User user) throws Exception {
		// TODO Auto-generated method stub
		if(user.getId()==null) {
			userDao.insert(user);
		}else {
			userDao.update(user);
			}
	}

	@Override
	public void deleteById(long id) throws Exception {
		// TODO Auto-generated method stub
		userDao.deleteById(id);
	}
	
	}	
