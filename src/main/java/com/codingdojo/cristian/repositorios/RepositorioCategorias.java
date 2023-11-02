package com.codingdojo.cristian.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.cristian.modelos.Categoria;

@Repository
public interface RepositorioCategorias extends CrudRepository<Categoria, Long>{

	
}
