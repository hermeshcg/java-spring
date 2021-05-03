package br.com.unifacef.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.unifacef.model.Medico;
import br.com.unifacef.repositories.MedicoRepository;

@RestController
public class MedicoController {
	
	@Autowired
	MedicoRepository injecao;
	
	@PostMapping("/medico")
	public String add(@RequestBody Medico medico) {
		injecao.save(medico);
		return "Médico inserido com sucesso";
	}
	
	@GetMapping("/medico")
	public List<Medico> get(){
		return injecao.findAll();
	}
	
	@DeleteMapping("/medico/{id}")
	public String remove(@PathVariable String id) {
		injecao.deleteById(id);
		return "Deletado com sucesso";
	}
	
	@PutMapping("/medico")
	public String put(@PathVariable Medico medico) {
		injecao.save(medico);
		return "Atualizado com sucesso";
	}
}
