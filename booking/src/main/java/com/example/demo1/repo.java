package com.example.demo1;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface repo extends MongoRepository<book,String>{
	@Query("{'name':?0}")
	public List<book> get(String name);
	
	@Query("{'fid':?0,'name':?1}")
	public book get(String fid,String name);
	
@Query(value="{'fid' : ?0,'name':?1}", delete = true)
public void delete(String fid,String name);
@Query("{'fid':?0,'name':?1}")
public List<book> ret(String name,String fid);

}
