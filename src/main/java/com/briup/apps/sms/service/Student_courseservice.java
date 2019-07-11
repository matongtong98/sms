package com.briup.apps.sms.service;

import java.util.List;

import com.briup.apps.sms.bean.Student_course;

public interface Student_courseservice {

	List<Student_course> selectAll();

	void saveOrUpdate(Student_course student_course) throws Exception;

}
