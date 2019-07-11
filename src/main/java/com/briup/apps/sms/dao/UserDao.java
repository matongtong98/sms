package com.briup.apps.sms.dao;

import java.util.List;
import com.briup.apps.sms.bean.User;
public interface UserDao {
  List<User> selectAll();
  
  void insert(User user);
  
  void update (User user);


  void deleteById(long id);
  
}