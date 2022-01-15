package com.example.demo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*", allowedHeaders = "*")
public interface repo extends MongoRepository<book,String>{
@Query("{'name':?0,'fid':?1}")
public List<book> get(String name,String fid);
}
