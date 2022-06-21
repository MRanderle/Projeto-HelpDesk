package com.gfinest.restapi.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gfinest.restapi.Services.Tecnicoservice;

import com.gfinest.restapi.domains.Tecnico;
import com.gfinest.restapi.domains.DTOs.TecnicoDTO;

@RestController
@RequestMapping(value="/tecnicos")
public class TecnicoResource {

	
	@Autowired
	private Tecnicoservice service;
	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<TecnicoDTO> findById(@PathVariable Integer id) {
		Tecnico obj = service.findById(id);
		return ResponseEntity.ok().body(new TecnicoDTO(obj));
	}
}
