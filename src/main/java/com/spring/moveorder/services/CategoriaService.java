package com.spring.moveorder.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.moveorder.model.Categorias;
import com.spring.moveorder.repositories.CategoriaRepository;

@Service
public class CategoriaService{
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categorias buscar(Integer id) {
		Optional<Categorias> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
