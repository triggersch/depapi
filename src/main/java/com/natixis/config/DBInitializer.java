package com.natixis.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.natixis.dao.DepartementRepository;
import com.natixis.domain.Departement;


@Service
public class DBInitializer {
	
	@Autowired
	private DepartementRepository repository;
	
	
	@PostConstruct
	public void initDB(){
		
		System.out.println("**************initdatabase***********");
		
		Departement dep = new Departement("14", "28", "calvados");
		repository.save(dep);
		
		dep = new Departement("50", "28", "manche");
		repository.save(dep);
		
	    dep = new Departement("61", "28", "orne");
		repository.save(dep);
		
		
	}

}
