package com.senai.mercado.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.mercado.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
