package com.ibm.academia.restap.universidad.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.academia.restap.universidad.enumeradores.TipoPizarron;
import com.ibm.academia.restap.universidad.modelo.entidades.Aula;
import com.ibm.academia.restap.universidad.repositorios.AulaRepository;

@Service
public class AulaDAOImpl extends GenericoDAOImpl<Aula, AulaRepository> implements AulaDAO
{
	@Autowired
	public AulaDAOImpl(@Qualifier("repositorioAula")AulaRepository repository) {
		super(repository);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Aula> findAulaByTipoPizarron(TipoPizarron tipoPizarron) {
		return repository.findAulaByTipoPizarron(tipoPizarron);
	}


	@Override
	@Transactional(readOnly = true)
	public Iterable<Aula> findAulaByNumeroAula(Integer Numero) {
		return repository.findAulaByNumeroAula(Numero);
	}



}
