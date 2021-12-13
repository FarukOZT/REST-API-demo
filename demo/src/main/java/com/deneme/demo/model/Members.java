package com.deneme.demo.model;

import java.util.UUID;
import javax.persistence.Id;

public class Members {
		
	@Id
	private UUID id;
	private String name;
	private String surname;
	
	public Members() {
	}
	public Members(UUID id, String name, String Surname) {
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
}
