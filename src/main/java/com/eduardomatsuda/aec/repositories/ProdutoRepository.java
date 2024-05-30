package com.eduardomatsuda.aec.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eduardomatsuda.aec.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{
}
