package com.briup.apps.sms.dao;

import java.util.List;

import com.briup.apps.sms.bean.Role;

public class Roledao {
	        //查询所有
			List<Role> selectAll();
			
			//插入
			void insert(Role role);
			
			//修改
			void update(Role role);

}
