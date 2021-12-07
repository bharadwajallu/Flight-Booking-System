package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class service_layer {
	@Autowired
	fserv fs1;
	String fid,fare,fclass,status,name;
	public booking add(String name) {
		this.fid=fs1.getid();
		this.fare=fs1.fare();
		this.fclass=fs1.getclass();
		status="booked";
		this.name=name;
		booking b1=new booking(fid,fare,fclass,status,name,"np");
		return b1;
	}
}