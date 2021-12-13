package com.deneme.demo.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.deneme.demo.model.Members;
import com.deneme.demo.repository.Repository;

@org.springframework.stereotype.Service

public class Service {
	
	@Autowired
    Repository repository;
    	
	public List<Members> 
	memberList = new ArrayList<>(Arrays.asList());
	
	public List<Members> getMembers(){
		return (List<Members>) repository.findAll();
	}
	
	public Optional<Members> getMember(UUID id) {
		return repository.findById(id);
	}
	
	public Members addMembers(Members members) {
		UUID id = UUID.randomUUID();
		members.setId(id);
		repository.save(members);
		return members;
	}
	
	public void deleteMembers(UUID id) {
		
		repository.deleteById(id);
	}
	
}