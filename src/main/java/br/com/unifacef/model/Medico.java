package br.com.unifacef.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="medico")
public class Medico {
	@Id
	private String id;
	
	private String nome, especialidade;
	private int CRM;
	
	
	public Medico(String id, String nome, String especialidade, int cRM) {
		
		this.id = id;
		this.nome = nome;
		this.especialidade = especialidade;
		CRM = cRM;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public int getCRM() {
		return CRM;
	}
	public void setCRM(int cRM) {
		CRM = cRM;
	}
	
	
}
