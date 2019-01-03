package org.bai.entities;

import java.util.Date;

public class Taux {
	
	private Long id;
	private String valeurTaux;

	private Date dateTaux;
	
	public Long getId() {
		return id;
	}
	public String getValeurTaux() {
		return valeurTaux;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setValeurTaux(String valeurTaux) {
		this.valeurTaux = valeurTaux;
	}
	
	public Taux() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Taux(String valeurTaux) {
		super();
		this.valeurTaux = valeurTaux;
	}
	
	

}
