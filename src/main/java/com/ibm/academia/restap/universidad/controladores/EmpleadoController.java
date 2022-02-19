package com.ibm.academia.restap.universidad.controladores;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.academia.restap.universidad.servicios.EmpleadoDAO;
import com.ibm.academia.restap.universidad.servicios.PersonaDAO;


@RestController
@RequestMapping("/restapi")
public class EmpleadoController {
	@Autowired
	@Qualifier("empleadoDAOImpl")
	private PersonaDAO personaDao;
	
	private EmpleadoDAO empleadoDao;
	
	
	/*@GetMapping("/carreras/lista")
	public List<Carrera> listarTodas()
	{
	//	List<Carrera> carreras = (List<Carrera>) carreraDao.buscarTodos();
	//	return carreras;
	}*/
}
