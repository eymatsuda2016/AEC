package com.eduardomatsuda.aec;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.eduardomatsuda.aec.domain.Categoria;
import com.eduardomatsuda.aec.repositories.CategoriaRepository;

import com.eduardomatsuda.aec.repositories.CategoriaRepository;

@SpringBootApplication
public class AecApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(AecApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Automóveis e Caminhonetas");
		Categoria cat2 = new Categoria(null, "Caminhões e Onibus");
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		
	}

}
