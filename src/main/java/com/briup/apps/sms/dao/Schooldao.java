package com.briup.apps.sms.dao;

import java.util.List;
import com.briup.apps.sms.bean.School;
public interface Schooldao {
  List<School> selectAll();
	// TODO Auto-generated method stub


  void insert(School school);
  void update (School school);
	// TODO Auto-generated method stub
	


}