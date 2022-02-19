package com.ibm.academia.restap.universidad.servicios;

import com.ibm.academia.restap.universidad.enumeradores.TipoPizarron;
import com.ibm.academia.restap.universidad.modelo.entidades.Aula;

public interface AulaDAO extends GenericoDAO<Aula>
{

	public Iterable<Aula> findAulaByTipoPizarron(TipoPizarron tipoPizarron);
	
	public Iterable<Aula> findAulaByNumeroAula(Integer Numero);
}
