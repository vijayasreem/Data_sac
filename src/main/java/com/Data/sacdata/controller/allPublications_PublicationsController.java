package com.Data.sacdata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Data.sacdata.model.allPublications_Publications;
import com.Data.sacdata.service.allPublications_PublicationsService;

@RestController
@RequestMapping("/publications")
public class allPublications_PublicationsController {
	
	@Autowired
	private allPublications_PublicationsService allPublications_PublicationsService;
	
	@GetMapping("/all")
	public List<allPublications_Publications> getAllPublications(){
		return allPublications_PublicationsService.getAllPublications();
	}
}