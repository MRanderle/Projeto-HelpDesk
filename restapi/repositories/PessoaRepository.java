package com.gfinest.restapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gfinest.restapi.domains.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
