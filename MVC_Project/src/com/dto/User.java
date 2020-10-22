package com.dto;

public class User {
	private int userId;
	private String fullname;
	private String userName;
	private String userPass;
	public User() {

	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", fullname=" + fullname + ", userName=" + userName + ", userPass=" + userPass
				+ "]";
	}
	
	
	
}
