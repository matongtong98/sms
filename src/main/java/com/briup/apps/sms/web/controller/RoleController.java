package com.briup.apps.sms.web.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.briup.apps.sms.bean.Clazz;
import com.briup.apps.sms.service.Clazzservice;
@RestController
@RequestMapping("/role")
public class RoleController {
	
	@Autowired
	private Roleservice roleservice;
	
	// http://localhost:8080/clazz/selectAll
	@GetMapping("selectAll")
	public List<Role> selectAll(){
		
		return roleservice.selectAll();
  }
}
