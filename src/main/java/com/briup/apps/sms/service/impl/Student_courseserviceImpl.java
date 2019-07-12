package com.briup.apps.sms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.briup.apps.sms.bean.College;
import com.briup.apps.sms.bean.Student_course;
import com.briup.apps.sms.dao.Student_Coursedao;
import com.briup.apps.sms.service.Student_courseservice;


@Service
public class Student_courseserviceImpl implements Student_courseservice {
	
	private static final Student_course Student_Course = null;
	@Resource
	private Student_Coursedao Student_coursedao;

	public List<Student_course> selectAll1() {
		// TODO Auto-generated method stub
		return Student_coursedao.selectAll();
	}

	@Override
	public List<Student_course> selectAll() {
		// TODO Auto-generated method stub
		return Student_coursedao.selectAll();
	}
	

	@Override
	public void deleteById(long id) throws Exception {
		// TODO Auto-generated method stub
		if(((College) Student_coursedao).getId()==null) {
			Student_coursedao.insert(Student_Course);
		}else {
			Student_coursedao.update(Student_Course);
		}
	}

	@Override
	public void saveOrUpdate(Student_course student_course) throws Exception {
		// TODO Auto-generated method stub
	}

	}
