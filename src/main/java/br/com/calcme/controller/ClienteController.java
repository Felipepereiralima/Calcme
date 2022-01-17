package br.com.calcme.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import br.com.calcme.model.Cliente;
import br.com.calcme.service.ClienteService;

@RestController
@RequestMapping("/clientes")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ClienteController {
		
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping
	public List<Cliente> obterTodos(){
		return this.clienteService.obterTodos();
	}
	
	@GetMapping("/{id}")
	public Cliente obterPorCodigo(@PathVariable String id) {
		return this.clienteService.obterPorCodigo(id);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente criar(@RequestBody Cliente cliente) {
		return this.clienteService.criar(cliente);
	}
	
}
