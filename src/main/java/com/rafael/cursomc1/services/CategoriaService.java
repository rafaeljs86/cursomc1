package com.rafael.cursomc1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafael.cursomc1.domain.Categoria;
import com.rafael.cursomc1.repositories.CategoriaRepositories;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepositories repo;
	
	public Categoria buscar(Integer id) {
		java.util.Optional<Categoria>  obj = repo.findById(id);
		return obj.orElse(null);
	}
	

}
