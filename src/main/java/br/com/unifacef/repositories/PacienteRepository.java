package br.com.unifacef.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.unifacef.model.Paciente;

public interface PacienteRepository extends MongoRepository<Paciente, String>{

}
