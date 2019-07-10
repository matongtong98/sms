package com.briup.apps.sms.dao;

import java.util.List;

import com.briup.apps.sms.bean.Clazz;
public interface Clazzdao {
	
		//查询所有
		List<Clazz> selectAll();
		
		//插入
		void insert(Clazz clazz);
		
		//修改
		void update(Clazz clazz);

}
