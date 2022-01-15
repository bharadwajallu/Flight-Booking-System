package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/checkin")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class controller {
	@Autowired
	repo rp;
	@GetMapping("/{name}/{fid}")
	public List<book> hey(@PathVariable String name,@PathVariable String fid) {
		return rp.get(name, fid);
	}
}
