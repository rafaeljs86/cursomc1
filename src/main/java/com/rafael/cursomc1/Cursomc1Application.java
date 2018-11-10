package com.rafael.cursomc1;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rafael.cursomc1.domain.Categoria;
import com.rafael.cursomc1.repositories.CategoriaRepositories;

@SpringBootApplication
public class Cursomc1Application implements CommandLineRunner{

	@Autowired
	private CategoriaRepositories categoriaRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Cursomc1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Escritório");
		Categoria cat2 = new Categoria(null, "Farmacia");
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
	}
}
