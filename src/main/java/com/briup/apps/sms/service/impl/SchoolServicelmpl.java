package com.briup.apps.sms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.apps.sms.bean.School;
import com.briup.apps.sms.dao.Schooldao;
import com.briup.apps.sms.service.SchoolService;

/**
 * 校园逻辑逻辑处理的实现类
 * */  
@Service
public class SchoolServicelmpl implements SchoolService {
	// 依赖注入，实例化SchoolDao并且赋值给schoolDao这个变量
	@Resource
	private Schooldao schooldao;

	@Override
	public List<School> selectAll() {
		// TODO Auto-generated method stub
		return schooldao.selectAll();
	}

	@Override
	public void saveOrUpdate(School school) throws Exception {
		// TODO Auto-generated method stub
		if(school.getId()==null) {
			schooldao.insert(school);
		}else {
			schooldao.update(school);
		}
	}
}