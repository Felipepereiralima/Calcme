package br.com.calcme.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import br.com.calcme.model.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente, String> {

}
