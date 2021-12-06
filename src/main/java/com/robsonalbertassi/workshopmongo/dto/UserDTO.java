package com.robsonalbertassi.workshopmongo.dto;

import java.io.Serializable;

import com.robsonalbertassi.workshopmongo.domain.User;

public class UserDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	private String email;
	private Integer age;
	
	public UserDTO() {
	}
	
	public UserDTO(User object) { // Constructor to instantiate from correspondent entity object
		id = object.getId();
		name = object.getName();
		email = object.getEmail();
		age = object.getAge();
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
