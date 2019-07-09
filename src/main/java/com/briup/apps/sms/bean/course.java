package com.briup.apps.sms.bean;

public class course {
	  private Long id;
	  private String name;
	  private String credit;
	  private long user_id;
	  
	  public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCredit() {
		return credit;
	}

	public void setCredit(String credit) {
		this.credit = credit;
	}

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public long getId() {
		  
		return id;

}
	  }
