package com.natixis.service;

import java.util.List;

import javax.annotation.Resource;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.natixis.dao.DepartementRepository;

import com.natixis.domain.Departement;


@RestController
public class DepartementServiceImpl implements DepartementService {
	
	
	@Resource
	private DepartementRepository repository;

	@Override
	@RequestMapping(value = "/departements", method = RequestMethod.GET)
	public ResponseEntity<?> listerDepartements() {

		List<Departement> departements = repository.findAll();
		return new ResponseEntity<>(departements, HttpStatus.OK);
	}


	@Override
	@RequestMapping(value = "/departement", method = RequestMethod.GET)
	public ResponseEntity<?> findDepartementByName(@RequestParam(value = "nom") String nom) {
		Departement departement = repository.findByNom(nom);
		return new ResponseEntity<>(departement, HttpStatus.OK);
	}

	@Override
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public ResponseEntity<?> creerDepartement(@RequestBody(required=true) Departement departement) {

		departement = repository.save(departement);
		return new ResponseEntity<>(departement, HttpStatus.CREATED);
	}


}
