package com.lucianafv.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucianafv.cursomc.domain.Pagamento;

@Repository
public interface  PagamentoRepository extends JpaRepository<Pagamento, Integer> {

}
