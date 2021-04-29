package br.com.unifacef.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.unifacef.model.Paciente;
import br.com.unifacef.repositories.PacienteRepository;

@RestController
public class PacienteController {
	
	@Autowired
	PacienteRepository injecao;
	
	public void add(@RequestBody Paciente paciente) {
		injecao.save(paciente);
	}
	
	public List<Paciente> get(){
		return injecao.findAll();
	}
}
