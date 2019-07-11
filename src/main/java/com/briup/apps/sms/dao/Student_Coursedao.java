package com.briup.apps.sms.dao;
import java.util.List;

import com.briup.apps.sms.bean.Student_course;
public interface Student_Coursedao {
	 List<Student_course> selectAll();
	  
	  void insert(Student_course student_Course);
	  
	  void update (Student_course student_Course);


	  void deleteById(long id);

	



}
