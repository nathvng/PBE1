package com.senaidev.livraria2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senaidev.livraria2.entities.Editora;

@Repository
public interface EditoraRepository extends JpaRepository<Editora, Long>{
	Editora findByCpf(String cpf);
}