package com.briup.apps.sms.bean;
<<<<<<< HEAD
/*
*学院信息
**/
public class College {
private Long id;
private String name;
private String description;	
private Long school_id;
public Long  getId() {
	return id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Long getSchool_id() {
	return school_id;
}
public void setSchool_id(Long school_id) {
	this.school_id = school_id;
}
public void setId(Long id) {
	this.id = id;
}
=======
>>>>>>> branch 'master' of https://github.com/matongtong98/sms.git

public class College {
	private Long id;
	private String name;
	private String description;
	private Long school_id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getSchool_id() {
		return school_id;
	}
	public void setSchool_id(Long school_id) {
		this.school_id = school_id;
	}
}
