package com.rafael.cursomc1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rafael.cursomc1.domain.Categoria;
import com.rafael.cursomc1.domain.Produto;
import com.rafael.cursomc1.repositories.CategoriaRepositories;
import com.rafael.cursomc1.repositories.ProdutoRepositories;

@SpringBootApplication
public class Cursomc1Application implements CommandLineRunner{

	@Autowired
	private CategoriaRepositories categoriaRepository;
	@Autowired
	private ProdutoRepositories produtoRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Cursomc1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Escritório");
		Categoria cat2 = new Categoria(null, "Farmacia");
		
		Produto p1 = new Produto(null, "teclado", 21.00);
		Produto p2 = new Produto(null, "mouse", 15.00);
		Produto p3 = new Produto(null, "monitor", 210.00);
		Produto p4 = new Produto(null, "suporte para monitor", 320.00);
		
		
		cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProdutos().addAll(Arrays.asList(p2, p4));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		p4.getCategorias().addAll(Arrays.asList(cat2));		
		p2.getCategorias().addAll(Arrays.asList(cat2));
		
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3, p4));
	}
}
