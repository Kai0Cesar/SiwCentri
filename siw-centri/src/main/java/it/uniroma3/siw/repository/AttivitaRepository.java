package it.uniroma3.siw.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import it.uniroma3.siw.model.Attivita;

public interface AttivitaRepository extends CrudRepository<Attivita, Long> {

	@Override
	public void delete(Attivita attivita);

	@Override
	public Iterable<Attivita> findAll();

	@Override
	public void deleteById(Long id);

	@Override
	public Optional<Attivita> findById(Long id);

	@Override
	public <S extends Attivita> S save(S attivita);

}
