package com.example.Test.Enums;

public enum Age {
 
       max_age(150);
	private int valeur;
	
	Age(int valeur) {
		      this.valeur = valeur;
		   }
	public int getValeur() {
		return valeur;
	}

	
	
}
