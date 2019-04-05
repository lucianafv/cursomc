package com.lucianafv.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucianafv.cursomc.domain.Cliente;
import com.lucianafv.cursomc.repositories.ClienteRepository;
import com.lucianafv.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	/* automaticamente instanciada pelo spring seja pelo mecanismo de injeção de dependência seja pela inversão de controle = autowired */
	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {

		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));

	}
}
