package com.senai.mercado.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.mercado.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
