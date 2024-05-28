package com.eduardomatsuda.aec.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduardomatsuda.aec.domain.Categoria;
import com.eduardomatsuda.aec.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired 
	CategoriaRepository repo;

	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
