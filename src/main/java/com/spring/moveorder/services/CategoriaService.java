package com.spring.moveorder.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.moveorder.model.Categoria;
import com.spring.moveorder.repositories.CategoriaRepository;
import com.spring.moveorder.services.exceptions.ObjectNotFoundException;


@Service
public class CategoriaService{
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id)  {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow( () -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo:" + Categoria.class.getName()));
	}
	
	public Categoria insert(Categoria obj) {
		obj.setId(null);
		return repo.save(obj);
	}

	
}
//"Objeto não encontrado! Id: " + id + ", Tipo:" + Categoria.class.getName()
