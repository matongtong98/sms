package com.briup.apps.sms.dao;

import java.util.List;
import com.briup.apps.sms.bean.School;
public interface SchoolDao {
  List<School> selectAll();
  
  void insert(School school);
  
  void update (School school);


}