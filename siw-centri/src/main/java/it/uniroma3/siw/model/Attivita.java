package it.uniroma3.siw.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Attivita {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
	@Temporal(TemporalType.DATE)
	private Date data;
	
	@Temporal(TemporalType.TIME)
	private Date ora;
	
	@ManyToOne
	private Centro centro;
	
	@OneToMany
	private List<Allievo> allievi;
	
	public Attivita() {
		this.allievi = new ArrayList<>();
	}

	public Centro getCentro() {
		return centro;
	}

	public void setCentro(Centro centro) {
		this.centro = centro;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public List<Allievo> getAllievi() {
		return allievi;
	}

	public void setAllievi(List<Allievo> allievi) {
		this.allievi = allievi;
	}
	
	public void addAllievo(Allievo allievo) {
		this.allievi.add(allievo);
	}
	
	public void removeAllievo(Allievo allievo) {
		this.allievi.remove(allievo);
	}

	public Date getOra() {
		return ora;
	}

	public void setOra(Date ora) {
		this.ora = ora;
	}	
}
