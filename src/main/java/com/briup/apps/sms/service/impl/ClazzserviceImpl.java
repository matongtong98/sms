package com.briup.apps.sms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.briup.apps.sms.bean.Clazz;
import com.briup.apps.sms.dao.Clazzdao;
import com.briup.apps.sms.service.Clazzservice;

/**
 * 校园逻辑逻辑处理的实现类
 * */  
@Service
public class ClazzserviceImpl implements Clazzservice {
	// 依赖注入，实例化SchoolDao并且赋值给schoolDao这个变量
	@Resource
	private Clazzdao clazzdao;

	@Override
	public List<Clazz> selectAll() {
		// TODO Auto-generated method stub
		return clazzdao.selectAll();
	}

	@Override
	public void saveOrUpdate(Clazz clazz) throws Exception {
		// TODO Auto-generated method stub
		if(clazz.getId()==null) {
			clazzdao.insert(clazz);
		}else {
			clazzdao.update(clazz);
		}
	}
}