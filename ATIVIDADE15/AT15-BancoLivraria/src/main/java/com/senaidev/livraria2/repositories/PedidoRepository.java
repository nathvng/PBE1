package com.senaidev.livraria2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.livraria2.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}