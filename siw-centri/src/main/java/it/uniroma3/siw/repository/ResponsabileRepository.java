package it.uniroma3.siw.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import it.uniroma3.siw.model.Responsabile;

public interface ResponsabileRepository extends CrudRepository<Responsabile, String> {

	@Override
	public void delete(Responsabile responsabile);

	@Override
	public void deleteById(String email);

	@Override
	public Optional<Responsabile> findById(String email);

	@Override
	public <S extends Responsabile> S save(S responsabile);

	@Override
	public Iterable<Responsabile> findAll();
}
