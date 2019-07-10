package com.briup.apps.sms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.briup.apps.sms.bean.College;
import com.briup.apps.sms.dao.Collegedao;
import com.briup.apps.sms.service.Collegeservice;

/**
 * 校园逻辑逻辑处理的实现类
 * */  
@Service
public class CollegeserviceImpl implements Collegeservice {
	// 依赖注入，实例化CollegeDao并且赋值给CollegeDao这个变量
	@Resource
	private Collegedao collegedao;

	@Override
	public List<College> selectAll() {
		// TODO Auto-generated method stub
		return collegedao.selectAll();
	}

	@Override
	public void saveOrUpdate(College college) throws Exception {
		// TODO Auto-generated method stub
		if(college.getId()==null) {
			collegedao.insert(college);
		}else {
			collegedao.update(college);
		}
	}
}