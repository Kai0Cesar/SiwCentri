package it.uniroma3.siw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.uniroma3.siw.model.Attivita;
import it.uniroma3.siw.services.AttivitaService;

@Controller
@RequestMapping("/attivita")
public class AttivitaController {
	
	@Autowired
	private AttivitaService attivitaService;
	
	@GetMapping("/list")
	public String listCustomer(Model model) {

		List<Attivita> attivita = attivitaService.findAll();

		model.addAttribute("attivita", attivita);

		return "list-attivita";
	}
	
	@GetMapping("/showFormAdd")
	public String showFormAdd(Model model) {

		Attivita attivita = new Attivita();

		model.addAttribute("attivita", attivita);

		return "attivita-form";
	}
	
	@PostMapping("/salvaAttivita")
	public String saveCustomer(@ModelAttribute("attivita") Attivita attivita) {
		
		attivitaService.save(attivita);

		return "redirect:/attivita/list";
	}


}
