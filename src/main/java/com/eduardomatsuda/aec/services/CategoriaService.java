package com.eduardomatsuda.aec.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduardomatsuda.aec.domain.Categoria;
import com.eduardomatsuda.aec.repositories.CategoriaRepository;
import com.eduardomatsuda.aec.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired 
	CategoriaRepository repo;

	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}
}
