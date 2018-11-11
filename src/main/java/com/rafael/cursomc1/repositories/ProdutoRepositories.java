package com.rafael.cursomc1.repositories;

import org.springframework.stereotype.Repository;

import com.rafael.cursomc1.domain.Produto;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface ProdutoRepositories  extends JpaRepository<Produto, Integer>{
	
}
