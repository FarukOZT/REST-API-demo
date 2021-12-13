package com.deneme.demo.repository;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.deneme.demo.model.Members;

public interface Repository extends MongoRepository<Members, UUID>{

}
