package com.gfinest.restapi.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.gfinest.restapi.Services.DBservice;

@Configuration
@Profile("dev")
public class DevConfig {

	@Autowired
	private DBservice dbservice;
	
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String value;
	
	@Bean
	public boolean instanciaDB( ) {
		this.dbservice.instanciaDB();
		if(value.equals("create")) {
			this.dbservice.instanciaDB();
	
		}
		
		return false;
	}
	
	}
	

