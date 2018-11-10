package com.rafael.cursomc1.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rafael.cursomc1.domain.Categoria;

@RestController
@RequestMapping (value = "/categorias")
public class CategoriaResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public List <Categoria>  listar() {
		
		Categoria cat1 = new Categoria(1, "manutenção");
		Categoria cat2 = new Categoria(2, "escritorio");
		Categoria cat3 = new Categoria(3, "recursos humanos");
		Categoria cat4 = new Categoria(4, "contabilidade");
		Categoria cat5 = new Categoria(5, "aumoxarifado");
		Categoria cat6 = new Categoria(6, "estacionamento");
		Categoria cat7 = new Categoria(7, "recepção");
		
		List<Categoria> lista = new ArrayList<>();
		
		lista.add(cat1);
		lista.add(cat2);
		lista.add(cat3);
		lista.add(cat4);
		lista.add(cat5);
		lista.add(cat6);
		lista.add(cat7);
		return lista;
	}

}
