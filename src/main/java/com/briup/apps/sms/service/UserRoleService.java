package com.briup.apps.sms.service;

import java.util.List;

import com.briup.apps.sms.bean.UserRole;

public interface UserRoleService {

	List<UserRole> selectAll();

	void saveOrUpdate(UserRole userRole) throws Exception;
	void deleteById(long id) throws Exception;
} 