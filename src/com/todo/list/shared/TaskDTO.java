package com.todo.list.shared;

import java.io.Serializable;

public class TaskDTO implements Serializable {

	private static final long serialVersionUID = -5611597563251297262L;

	String description;
	String key;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	
	
}
