package it.uniroma3.siw.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.siw.model.Centro;
import it.uniroma3.siw.repository.CentroRepository;

@Service
public class CentroService {
	@Autowired
	private CentroRepository centroRepository;

	public void delete(Centro centro) {
		centroRepository.delete(centro);
	}

	public void deleteById(String nome) {
		centroRepository.deleteById(nome);
	}

	public Centro findById(String nome) {
		return centroRepository.findById(nome).get();
	}

	public void save(Centro centro) {
		centroRepository.save(centro);
	}

	public List<Centro> findAll() {
		return (List<Centro>) centroRepository.findAll();
	}
}
