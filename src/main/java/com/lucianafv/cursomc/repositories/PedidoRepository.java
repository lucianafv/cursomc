package com.lucianafv.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucianafv.cursomc.domain.Pedido;

@Repository
public interface  PedidoRepository extends JpaRepository<Pedido, Integer> {

}
