package com.example.Test.services;

import java.util.List;

import com.example.Test.dto.PersonneDto;
import com.example.Test.entities.Personne;

public interface PersonneService {
	
	Object addPersonne(Personne p);
	List<PersonneDto> getPersonnes();

}
