package com.Acceptrequest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Acceptrequest.model.AcceptReq;

@Repository
public interface Acceptrequest extends JpaRepository<AcceptReq, Long>  {

}
