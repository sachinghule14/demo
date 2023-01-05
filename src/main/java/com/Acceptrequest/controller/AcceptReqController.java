package com.Acceptrequest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Acceptrequest.model.AcceptReq;
import com.Acceptrequest.service.Accept;



@RestController
public class AcceptReqController {
	
	@Autowired
	Accept accept;
	
	@GetMapping("/hii")
	public String request()
	{
		return "Thank you...!!"; 
	}
	
	@GetMapping("/request")
	public List<AcceptReq> allrequest()
	{
		return accept.allrequest();
	}
	
	@PostMapping("/allrequest")
	public String addrequest(@RequestBody AcceptReq request) {
		accept.addrequest(request);
		return "Request Acccepted.............";
	}
	

}
