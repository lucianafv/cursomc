package com.lucianafv.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucianafv.cursomc.domain.Categoria;
import com.lucianafv.cursomc.repositories.CategoriaRepository;
import com.lucianafv.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	/* automaticamente instanciada pelo spring seja pelo mecanismo de injeção de dependência seja pela inversão de controle = autowired */
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {

		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));

	}
}
