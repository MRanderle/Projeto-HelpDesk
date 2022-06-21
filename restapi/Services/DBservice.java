package com.gfinest.restapi.Services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gfinest.restapi.domains.Chamado;
import com.gfinest.restapi.domains.Cliente;
import com.gfinest.restapi.domains.Tecnico;
import com.gfinest.restapi.domains.enums.Perfil;
import com.gfinest.restapi.domains.enums.Prioridade;
import com.gfinest.restapi.domains.enums.Status;
import com.gfinest.restapi.repositories.ChamadoRepository3;
import com.gfinest.restapi.repositories.ClienteRepository2;
import com.gfinest.restapi.repositories.TecnicoRepository3;

@Service
public class DBservice {
	
	@Autowired 
	private TecnicoRepository3 tecnicoRepository;
	@Autowired
	private ClienteRepository2 clienteRepository;
	@Autowired
	private ChamadoRepository3 chamadoRepository;

	public void instanciaDB() {
		 Tecnico tec1 = new Tecnico(null, "Alisson Anderle", "06585246875", "alisson1@gmail.com", "123");		
			tec1.addPerfil(Perfil.ADMIN);
			
			Cliente cli1 = new Cliente(null, "Rodrigo sousa", "01454578596", "RodrigoSousa@live.com", "456");
			
			Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1, cli1);
			
			
			tecnicoRepository.saveAll(Arrays.asList(tec1));
			clienteRepository.saveAll(Arrays.asList(cli1));
			chamadoRepository.saveAll(Arrays.asList(c1));
		
	}
	
	
	}
