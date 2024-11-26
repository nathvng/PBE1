package com.senaidev.livraria2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senaidev.livraria2.entities.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long>{
	Livro findByCpf(String cpf);
}
