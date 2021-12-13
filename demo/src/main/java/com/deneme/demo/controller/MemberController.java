package com.deneme.demo.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deneme.demo.model.Members;
import com.deneme.demo.services.Service;

@RestController
@RequestMapping("/members")
public class MemberController {
	
	@Autowired
	public Service services;
	
	@GetMapping
	public ResponseEntity<List<Members>> getAllMembers() {
		return ResponseEntity.ok(services.getMembers());
	}
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Members>> getMember(@PathVariable("id") UUID id){
		return ResponseEntity.ok(services.getMember(id));
	}
	
	@PostMapping("/add")
		public ResponseEntity<Members> addMembers(@RequestBody Members members) {
		return ResponseEntity.ok(services.addMembers(members));
	}
	
	@DeleteMapping("/{id}")
		public void deleteMembers(@PathVariable("id") UUID id) {
		services.deleteMembers(id);	
	}
	
}