package com.briup.apps.sms.bean;
/*
*学院信息
**/
public class College {
private long id;
private String name;
private String description;	
private long school_id;
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
public long getSchool_id() {
	return school_id;
}
public void setSchool_id(long school_id) {
	this.school_id = school_id;
}
public void setId(long id) {
	this.id = id;
}

}
