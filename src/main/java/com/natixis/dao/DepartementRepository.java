package com.natixis.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.natixis.domain.Departement;

public interface DepartementRepository extends JpaRepository< Departement, Long>{
	public Departement findByNom(String nom);
}
