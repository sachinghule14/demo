package com.Acceptrequest.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Acceptrequest.model.AcceptReq;
import com.Acceptrequest.repository.Acceptrequest;
import com.Acceptrequest.service.Accept;

@Service
public class AcceptRequestimp implements Accept{
	
	@Autowired
	Acceptrequest acceptrequest;

	@Override
	public List<AcceptReq> allrequest() {
		return acceptrequest.findAll();
	}

	@Override
	public AcceptReq addrequest(AcceptReq request) {
		return acceptrequest.save(request);
	}
	
	
	
	

}
