package com.briup.apps.sms.bean;
/**
 *校园信息
 **/
public class School {
  private Long id;
  private String name;
  private String description;
  private String tel;
  private String address;
public Long getId() {
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
public String getTel() {
	return tel;
}
public void setTel(String tel) {
	this.tel = tel;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public void setId(Long id) {
	this.id = id;
}

}