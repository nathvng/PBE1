package com.senaidev.livraria2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.livraria2.entities.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long> {

}