package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface repo extends MongoRepository<booking2,String>{
@Query("{'name':?0,'fid':?1}")
booking2 get(String name,String fid);
}