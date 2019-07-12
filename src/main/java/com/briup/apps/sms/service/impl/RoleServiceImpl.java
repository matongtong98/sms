package com.briup.apps.sms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.briup.apps.sms.bean.Role;
import com.briup.apps.sms.dao.Roledao;
import com.briup.apps.sms.service.Roleservice;

/**
 * 校园逻辑逻辑处理的实现类
 * */  
@Service
public class RoleServiceImpl implements Roleservice {
	// 依赖注入，实例化SchoolDao并且赋值给schoolDao这个变量
	@Resource
	private Roledao roledao;

	@Override
	public List<Role> selectAll() {
		// TODO Auto-generated method stub
		return roledao.selectAll();
	}

	@Override
	public void saveOrUpdate(Role role) throws Exception {
		// TODO Auto-generated method stub
		if(role.getId()==null) {
			roledao.insert(role);
		}else {
			roledao.update(role);
		}
	}

	@Override
	public void deleteById(long id) throws Exception {
		// TODO Auto-generated method stub
		roledao.deleteById(id);
		
	}
}