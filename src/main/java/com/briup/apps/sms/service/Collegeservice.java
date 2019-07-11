package com.briup.apps.sms.service;

import java.util.List;

import com.briup.apps.sms.bean.College;


public interface Collegeservice {

	List<College> selectAll();

	void saveOrUpdate(College college) throws Exception;

	void deleteById(long id) throws Exception;
}
