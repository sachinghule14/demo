package com.Acceptrequest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AcceptReq {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	private String cartype;
	private String source;
	private String destination;
	private String email;
	private String status;
	
	public AcceptReq() {
		super();
	}




	public AcceptReq(String cartype, String source, String destination,String email,String status) {
		super();
		this.cartype = cartype;
		this.source = source;
		this.destination = destination;
		this.email = email;
		this.status = status;
	}




	public String getCartype() {
		return cartype;
	}




	public void setCartype(String cartype) {
		this.cartype = cartype;
	}




	public String getSource() {
		return source;
	}




	public void setSource(String source) {
		this.source = source;
	}




	public String getDestination() {
		return destination;
	}




	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	public String getemail()
	{
		return email;
	}
	
	public void setemail(String email) {
		this.email=email;
	}
	
	public String getstatus()
	{
		return status;
	}
	
	public void setstatus(String status) {
		this.status=status;
	}



	@Override
	public String toString() {
		return "AcceptReq [cartype=" + cartype + ", source=" + source + ", destination=" + destination + ", Email=" + email +  ", Status=" + status + "]";
	}
	
	

}
