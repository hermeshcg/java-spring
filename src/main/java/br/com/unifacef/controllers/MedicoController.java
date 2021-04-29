package br.com.unifacef.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.unifacef.model.Medico;
import br.com.unifacef.repositories.MedicoRepository;

@RestController
public class MedicoController {
	
	@Autowired
	MedicoRepository injecao;
	
	public void add(@RequestBody Medico medico) {
		injecao.save(medico);
	}
	
	public List<Medico> get(){
		return injecao.findAll();
	}
}
