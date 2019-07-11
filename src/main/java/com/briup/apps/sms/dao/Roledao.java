package com.briup.apps.sms.dao;

import java.util.List;

import com.briup.apps.sms.bean.Role;

public interface Roledao {
	        //查询所有
			List<Role> selectAll();
			
			//插入
			void insert(Role role);
			
			//修改
			void update(Role role);
		    
			//删除
			void deleteById(long id);

}
