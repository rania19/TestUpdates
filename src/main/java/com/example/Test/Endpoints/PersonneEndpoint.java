package com.example.Test.Endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Test.entities.Personne;
import com.example.Test.services.PersonneService;

@RestController
@RequestMapping("/personne")
public class PersonneEndpoint {
    
	
	@Autowired
	private PersonneService personneService;
	
	// create new Personne
    @PostMapping("/add")
    public Object addPersonne(@RequestBody Personne personne){
       Personne p= (Personne) personneService.addPersonne(personne);
       return p;
    }
	
    @GetMapping("/get")
    public Object getPersonne(){
       return personneService.getPersonnes();
    }
}

