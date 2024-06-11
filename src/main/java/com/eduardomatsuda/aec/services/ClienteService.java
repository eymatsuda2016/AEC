package com.eduardomatsuda.aec.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduardomatsuda.aec.domain.Cliente;
import com.eduardomatsuda.aec.repositories.ClienteRepository;
import com.eduardomatsuda.aec.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired 
	ClienteRepository repo;

	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}
}
