package it.uniroma3.siw.model;

import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Azienda {
	
	@Id
	private String nome;
	
	@OneToMany
	private Map<String,Allievo> allievi;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}