package com.eduardomatsuda.aec;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.eduardomatsuda.aec.domain.Categoria;
import com.eduardomatsuda.aec.domain.Produto;
import com.eduardomatsuda.aec.repositories.CategoriaRepository;
import com.eduardomatsuda.aec.repositories.ProdutoRepository;
import com.eduardomatsuda.aec.repositories.CategoriaRepository;

@SpringBootApplication
public class AecApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(AecApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Automóveis e Caminhonetas");
		Categoria cat2 = new Categoria(null, "Caminhões e Onibus");
		
		Produto p1 = new Produto(null, "bateria de 12 V 70 A", 2000.00);
		Produto p2 = new Produto(null, "Jogo de Velas NGK", 800.00);
		Produto p3 = new Produto(null, "Jogo de Cabo de Velas", 80.00);
		
		cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3));
		
	}

}
