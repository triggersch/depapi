package com.natixis.service;



import org.springframework.http.ResponseEntity;

import com.natixis.domain.Departement;


public interface DepartementService {
	
    ResponseEntity<?> creerDepartement(Departement lieu);
	
	ResponseEntity<?> listerDepartements();
	
	ResponseEntity<?> findDepartementByName(String nom);

}
