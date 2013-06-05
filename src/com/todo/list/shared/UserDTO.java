package com.todo.list.shared;

import java.io.Serializable;

public class UserDTO implements Serializable {

	private static final long serialVersionUID = -3659522350854635278L;

	String email;
	String password;
	String key;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}

}
