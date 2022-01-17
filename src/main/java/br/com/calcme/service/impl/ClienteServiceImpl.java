package br.com.calcme.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.calcme.model.Cliente;
import br.com.calcme.repository.ClienteRepository;
import br.com.calcme.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public List<Cliente> obterTodos() {
		return this.clienteRepository.findAll();
	}

	@Override
	public Cliente obterPorCodigo(String id) {
		return this.clienteRepository
				.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Cliente não existe."));
	}

	@Override
	public Cliente criar(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}

}
