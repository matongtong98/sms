package com.briup.apps.sms.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.sms.bean.School;
import com.briup.apps.sms.bean.Student_course;
import com.briup.apps.sms.service.SchoolService;
import com.briup.apps.sms.service.Student_courseservice;

@RestController
@RequestMapping("/student_course")
public class Student_courseController {

	@Autowired
	private Student_courseservice student_courseservice;

	
	@PostMapping("saveOrUpdate")
	public String saveOrUpdate(Student_course student_course) {
		try {
			student_courseservice.saveOrUpdate(student_course);
			return "保存或更新成功";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return e.getMessage();
		}
	}
	// http://localhost:8080/school/selectAll
	@GetMapping("selectAll")
	public List<Student_course> selectAll(){
		return student_courseservice.selectAll();
   }
	@GetMapping("deleteById")
	public String deleteById(long id) {
		try {
			student_courseservice.deleteById(id);
			return "删除成功";
		} catch (Exception e) {
			// 打印异常信息，返回异常信息
			e.printStackTrace();
			return e.getMessage();
		}
	}

}