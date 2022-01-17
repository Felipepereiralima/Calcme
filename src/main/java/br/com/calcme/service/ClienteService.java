package br.com.calcme.service;

import java.util.List;
import br.com.calcme.model.Cliente;

public interface ClienteService {

	public List<Cliente> obterTodos();
	
	public Cliente obterPorCodigo(String id);
	
	public Cliente criar(Cliente cliente);
}
