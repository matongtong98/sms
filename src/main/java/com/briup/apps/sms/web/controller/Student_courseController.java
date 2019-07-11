package com.briup.apps.sms.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.sms.bean.Student_course;
import com.briup.apps.sms.service.Student_courseservice;


@RestController
@RequestMapping("/student_course")
public class Student_courseController {

	@Autowired
	private Student_courseservice student_courseservice;

	// http://localhost:8080/school/selectAll
	@GetMapping("selectAll")
	public List<Student_course> selectAll(){
		return student_courseservice.selectAll();
	}
}
 