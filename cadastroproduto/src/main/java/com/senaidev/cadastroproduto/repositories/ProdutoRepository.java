package com.senaidev.cadastroproduto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.cadastroproduto.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
