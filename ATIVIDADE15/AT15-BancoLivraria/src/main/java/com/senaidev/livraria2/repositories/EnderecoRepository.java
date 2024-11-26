package com.senaidev.livraria2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.livraria2.entities.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

}