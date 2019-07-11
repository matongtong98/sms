package com.briup.apps.sms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.briup.apps.sms.bean.Student_course;
import com.briup.apps.sms.dao.Student_Coursedao;
import com.briup.apps.sms.service.Student_courseservice;


@Service
public class Student_courseserviceImpl implements Student_courseservice {
	
	@Resource
	private Student_Coursedao Student_coursedao;

	public List<Student_course> selectAll() {
		// TODO Auto-generated method stub
		return Student_coursedao.selectAll();
	}

	@Override
	public void saveOrUpdate(Student_course Student_course) throws Exception {
		// TODO Auto-generated method stub
		if(Student_course.getId()==null) {
			Student_Coursedao.insert(Student_course);
		}else {
			Student_Coursedao.update(Student_course);
		}
	}
}