package com.example.Test.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Test.entities.Personne;

@Repository
public interface PersonneRepository extends CrudRepository<Personne, Long> {
	List<Personne> findByOrderByNomAscPrenomAsc();

}
