package com.gfinest.restapi.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.gfinest.restapi.Services.DBservice;

@Configuration
@Profile("test")
public class TestConfig {

	@Autowired
	private DBservice dbservice;
	
	@Bean
	public void instanciaDB( ) {
		this.dbservice.instanciaDB();
	}
	
	}
	

