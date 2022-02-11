
package com.ibm.academia.restap.universidad.repositorios;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository("repositorioProfesor")
public interface ProfesorRepository extends PersonaRepository
{
}
