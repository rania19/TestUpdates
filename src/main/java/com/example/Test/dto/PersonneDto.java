package com.example.Test.dto;

import java.time.LocalDate;

public class PersonneDto {
	
	    private Long idPersonne;
		private String nom;
		private String prenom;
		private LocalDate dateNaissance;
		private Long ageActuel;
		public Long getIdPersonne() {
			return idPersonne;
		}
		public void setIdPersonne(Long idPersonne) {
			this.idPersonne = idPersonne;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getPrenom() {
			return prenom;
		}
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		public LocalDate getDateNaissance() {
			return dateNaissance;
		}
		public void setDateNaissance(LocalDate dateNaissance) {
			this.dateNaissance = dateNaissance;
		}
		public Long getAgeActuel() {
			return ageActuel;
		}
		public void setAgeActuel(Long ageActuel) {
			this.ageActuel = ageActuel;
		}
		
}
