package com.natixis.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Departement {
	
	@Id
	@GeneratedValue
	private Long  id;
	@Column(nullable=false)
	private String code;
	@Column(nullable=false)
	private String nom;
	@Column(nullable=false)
	private String codeRegion;
	
	public Departement() {}
	
	
	public Departement(String code, String codeRegion,
			           String nom) {
		

		this.code = code;
		this.codeRegion = codeRegion;
		this.nom = nom;
	}



	public Long getId() {
		return id;
	}
	
	
	public String getCode() {
		return code;
	}


	public String getCodeRegion() {
		return codeRegion;
	}
	

	public String getNom() {
		return nom;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setCodeRegion(String codeRegion) {
		this.codeRegion = codeRegion;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
