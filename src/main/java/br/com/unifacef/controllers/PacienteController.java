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

import br.com.unifacef.model.Paciente;
import br.com.unifacef.repositories.PacienteRepository;

@RestController
public class PacienteController {
	
	@Autowired
	PacienteRepository injecao;
	
	@PostMapping("/paciente")
	public void add(@RequestBody Paciente paciente) {
		injecao.save(paciente);
	}
	
	@GetMapping("/paciente")
	public List<Paciente> get(){
		return injecao.findAll();
	}
	
	@DeleteMapping("/paciente/{id}")
	public String remove(@PathVariable String id) {
		injecao.deleteById(id);
		return "Deletado com sucesso";
	}
	
	@PutMapping("/paciente")
	public String put(@PathVariable Paciente paciente) {
		injecao.save(paciente);
		return "Atualizado com sucesso";
	}
}
