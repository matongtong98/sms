package com.briup.apps.sms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.briup.apps.sms.bean.UserRole;
import com.briup.apps.sms.dao.UserRoledao;
import com.briup.apps.sms.service.UserRoleService;

/**
 * 校园逻辑逻辑处理的实现类
 * */  
@Service
public class UserRoleServiceImpl implements UserRoleService {
	// 依赖注入，实例化SchoolDao并且赋值给schoolDao这个变量
	@Resource
	private UserRoledao  userRoledao;

	@Override
	public List<UserRole> selectAll() {
		// TODO Auto-generated method stub
		return userRoledao.selectAll();
	}

	@Override
	public void saveOrUpdate(UserRole userRole) throws Exception {
		// TODO Auto-generated method stub
		if(userRole.getId()==null) {
			userRoledao.insert(userRole);
		}else {
			userRoledao.update(userRole);
		}
	}
}