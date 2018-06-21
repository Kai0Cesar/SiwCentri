package it.uniroma3.siw.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import it.uniroma3.siw.model.Allievo;

public interface AllievoRepository extends CrudRepository<Allievo, String> {

	@Override
	public long count();

	@Override
	@Query
	public void deleteById(String email);

	@Override
	public boolean existsById(String email);

	@Override
	public Iterable<Allievo> findAll();

	@Override
	@Query
	public Optional<Allievo> findById(String email);

	@Override
	public <S extends Allievo> S save(S Allievo);

}
