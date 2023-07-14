package com.example.Test.services;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Test.Enums.Age;
import com.example.Test.Exceptions.ageNotValidException;
import com.example.Test.dto.PersonneDto;
import com.example.Test.entities.Personne;
import com.example.Test.repositories.PersonneRepository;

@Service
public class PersonneServiceImpl implements PersonneService {
	
	@Autowired
	private PersonneRepository personneRepository;
	@Autowired 
	private ModelMapper modelMapper;
	
	

	@Override
	public Object addPersonne(Personne p) {
		  LocalDate now = LocalDate.now();
	      int age = Period.between(p.getDateNaissance(), now).getYears();
	      if(age < Age.max_age.getValeur()) {
	    	  p.setAgeActuel(Period.between(p.getDateNaissance(), now).getYears());
	    	  personneRepository.save(p); 
	    	  return p;
	      }
	      else {
	    	  throw new ageNotValidException("l'age de la personne doit etre inférieur à 150");
	      }
		
	}

	@Override
	public List<PersonneDto> getPersonnes() {
	
		List<Personne> personnes =   personneRepository.findByOrderByNomAscPrenomAsc();
		List<PersonneDto> dtos = personnes
				  .stream()
				  .map(p -> modelMapper.map(p, PersonneDto.class))
				  .collect(Collectors.toList());
		return dtos;
	
	}

}
