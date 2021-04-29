package br.com.unifacef.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.unifacef.model.Medico;

public interface MedicoRepository extends MongoRepository<Medico, String>{

}
