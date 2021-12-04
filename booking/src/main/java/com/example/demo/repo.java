package com.example.demo;


import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface repo extends MongoRepository<booking,String>{
	@Query("{'name':?0}")
	public List<booking> get(String name);
	
	@Query("{'fid':?0,'name':?1}")
	public booking get(String fid,String name);
	
@Query(value="{'fid' : ?0,'name':?1}", delete = true)
public booking delete(String fid,String name);
@Query("{'fid':?0,'name':?1}")
public boolean getstat(String fid,String name);
}