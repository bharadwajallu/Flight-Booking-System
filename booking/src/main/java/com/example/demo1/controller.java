package com.example.demo1;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/booking")
@CrossOrigin(origins="*")
public class controller {
	
@Autowired
repo rp;
@Autowired
service_layer s;
	@GetMapping("/{fid}/{fclass}/{name}")
	public List<book>add(@PathVariable String name,@PathVariable String fid,@PathVariable String fclass) {
		book b1=new book(fid,null,fclass, null,name, null);
		rp.insert(b1);
		return rp.ret(name, fid);
	}
	
@GetMapping("/cancel/{fid}/{name}")
	public String cancel(@PathVariable String fid,@PathVariable String name){
		try
	  	{  
	  	book b1=rp.get(fid, name);
	  	if(b1.getStatus().contentEquals("booked"))
	  	{
	  		rp.delete(fid, name);
	  		return "booking canceled";
	  	}
	  	else
	  	return "sorry record doesnt exist"; 
	  }catch(Exception e) { 
		  return e.getMessage();
		  }
	}
	 
	 @GetMapping("/mybookings/{name}")
	 public List<book>getdata(@PathVariable String name){
		 return rp.get(name);
	 }		
}
