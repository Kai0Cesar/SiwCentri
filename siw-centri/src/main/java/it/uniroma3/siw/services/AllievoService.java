package it.uniroma3.siw.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.siw.model.Allievo;
import it.uniroma3.siw.repository.AllievoRepository;

@Service
public class AllievoService {

	@Autowired
	private AllievoRepository allievoRepository;
	

	public long count() {
		return allievoRepository.count();
	}

	public void deleteById(String email) {
		allievoRepository.deleteById(email);
	}

	public boolean existsById(String email) {
		return allievoRepository.existsById(email);
	}

	public List<Allievo> findAll(){
		return (List<Allievo>) allievoRepository.findAll();
	}

	public Allievo findById(String email) {
		return  allievoRepository.findById(email).get();
	}

	public void save(Allievo a) {
		allievoRepository.save(a);
	}
	
	
}
