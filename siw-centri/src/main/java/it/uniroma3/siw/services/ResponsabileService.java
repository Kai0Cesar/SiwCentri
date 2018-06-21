package it.uniroma3.siw.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.siw.model.Responsabile;

@Service
public class ResponsabileService {

	@Autowired
	private ResponsabileService responsabileService;
	
	public void delete(Responsabile responsabile) {
		responsabileService.delete(responsabile);
	}

	public void deleteById(String email) {
		responsabileService.deleteById(email);
	}

	public Responsabile findById(String email){
		return responsabileService.findById(email);
	}

	public void save(Responsabile responsabile) {
		responsabileService.save(responsabile);
	}

	public List<Responsabile> findAll(){
		return (List<Responsabile>) responsabileService.findAll();
	}
	
}
