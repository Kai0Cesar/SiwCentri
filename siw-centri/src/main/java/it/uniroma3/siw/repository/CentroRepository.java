package it.uniroma3.siw.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import it.uniroma3.siw.model.Centro;

public interface CentroRepository extends CrudRepository<Centro, String> {

	@Override
	public void delete(Centro centro);

	@Override
	public void deleteById(String nome);
	
	@Override
	public Optional<Centro> findById(String nome);

	@Override
	public <S extends Centro> S save(S centro);

	@Override
	public Iterable<Centro> findAll();
}
