package com.codingdojo.cristian.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.cristian.modelos.Producto;

@Repository
public interface RepositorioProductos extends CrudRepository<Producto, Long> {

	
}
