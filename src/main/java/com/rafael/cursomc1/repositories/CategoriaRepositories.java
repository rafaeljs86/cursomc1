package com.rafael.cursomc1.repositories;

import org.springframework.stereotype.Repository;

import com.rafael.cursomc1.domain.Categoria;

import org.springframework.data.jpa.repository.JpaRepository;




@Repository
public interface CategoriaRepositories  extends JpaRepository<Categoria, Integer>{

	
	
	
}
