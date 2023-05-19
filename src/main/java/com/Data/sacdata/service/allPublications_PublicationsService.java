package com.Data.sacdata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Data.sacdata.model.allPublications_Publications;
import com.Data.sacdata.repository.allPublications_PublicationsRepository;

@Service
public class allPublications_PublicationsService {

	@Autowired
	private allPublications_PublicationsRepository allPublications_PublicationsRepository;
	
	public List<allPublications_Publications> getAllPublications(){
		return allPublications_PublicationsRepository.findAllByOrderByNameAsc();
	}
	
}