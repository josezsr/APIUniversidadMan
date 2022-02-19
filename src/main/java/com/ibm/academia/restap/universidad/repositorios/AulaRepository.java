package com.ibm.academia.restap.universidad.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.academia.restap.universidad.enumeradores.TipoPizarron;
import com.ibm.academia.restap.universidad.modelo.entidades.Aula;

@Repository("repositorioAula")
public interface AulaRepository extends CrudRepository<Aula, Long>
{
	public Iterable<Aula> findAulaByTipoPizarron(TipoPizarron tipoPizarron);
	public Iterable<Aula> findAulaByNumeroAula(Integer Numero);

}
