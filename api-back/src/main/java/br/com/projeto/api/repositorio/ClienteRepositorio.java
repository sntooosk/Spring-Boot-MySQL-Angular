package br.com.projeto.api.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.api.modelo.Cliente;

@Repository
public interface ClienteRepositorio extends CrudRepository<Cliente, Long> {

}