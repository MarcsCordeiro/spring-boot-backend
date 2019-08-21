package com.spring.moveorder.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.moveorder.model.Cliente;
import com.spring.moveorder.repositories.ClienteRepository;
import com.spring.moveorder.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrao: Id" + id + ", Tipo:" + Cliente.class.getName()));
	}
}
