package com.gfinest.restapi.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.gfinest.restapi.Services.Exception.ObjectNotFoundException;
import com.gfinest.restapi.domains.Tecnico;
import com.gfinest.restapi.repositories.TecnicoRepository3;

public class Tecnicoservice {
	
	@Autowired
	private TecnicoRepository3 repository;
	
	
	public Tecnico findById(Integer id) {
	
		
		Optional<Tecnico> obj = repository.findById(id);
	    return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! id: " + id));
	    }
	
	

}
