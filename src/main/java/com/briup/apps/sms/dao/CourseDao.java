package com.briup.apps.sms.dao;

import java.util.List;
import com.briup.apps.sms.bean.Course;
public interface CourseDao {
	
  List<Course> selectAll();
  
  void insert(Course course);
  
  void update (Course course);
  void deleteById(long id);

  
}