package com.Acceptrequest.service;

import java.util.List;

import com.Acceptrequest.model.AcceptReq;

public interface Accept{
	
	List<AcceptReq> allrequest();
	AcceptReq addrequest(AcceptReq request);

}
