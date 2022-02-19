package com.ibm.academia.restap.universidad.controladores;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.academia.restap.universidad.excepciones.NotFoundException;
import com.ibm.academia.restap.universidad.modelo.entidades.Carrera;
import com.ibm.academia.restap.universidad.modelo.entidades.Persona;
import com.ibm.academia.restap.universidad.servicios.AlumnoDAO;
import com.ibm.academia.restap.universidad.servicios.CarreraDAO;
import com.ibm.academia.restap.universidad.servicios.PersonaDAO;

@RestController
@RequestMapping("/restapi")
public class CarreraController {
	
	@Autowired
	private CarreraDAO carreraDao;
	
	/**
	 * Endpoint para consultar todas las carreras
	 * @return Retorna una lista de carreras.
	 * @author NDSC - 14-02-2022
	 */
	@GetMapping("/carreras/lista")
	public List<Carrera> listarTodas()
	{
		List<Carrera> carreras = (List<Carrera>) carreraDao.buscarTodos();
		return carreras;
	}
	
	/**
	 * Endpoint para consultar una carrera por id
	 * @param carreraId Parámetro de búsqueda de la carrera
	 * @return Retorna un objeto de tipo carrera
	 * @NotFoundException En caso de que falle buscando la carrera
	 * @author NDSC - 14-02-2022
	 */
	@GetMapping("/carrera/carreraId/{carreraId}")
	public ResponseEntity<?> buscarPorId(@PathVariable Long carreraId)
	{
		Optional<Carrera> oCarrera = carreraDao.buscarPorId(carreraId);
		
		if(!oCarrera.isPresent())
			throw new NotFoundException(String.format("La carrera con id: %d no existe", carreraId));
		
		return new ResponseEntity<Carrera>(oCarrera.get(), HttpStatus.OK);	
	}
	
	@PostMapping("/carrera")
	public ResponseEntity<?> guardar(@Valid @RequestBody Carrera carrera, BindingResult result)
	{
		Map<String, Object> validaciones = new HashMap<String, Object>();
		if(result.hasErrors())
		{
			List<String> listaErrores = result.getFieldErrors()
					.stream()
					.map(errores -> "Campo: '" + errores.getField() + "' " + errores.getDefaultMessage())
					.collect(Collectors.toList());
			validaciones.put("Lista Errores", listaErrores);
			return new ResponseEntity<Map<String, Object>>(validaciones, HttpStatus.BAD_REQUEST);
		}
		
		Carrera carreraGuardada = Carrera.guardar(carrera);
		return new ResponseEntity<Carrera>(carreraGuardada, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/carrera/eliminar/carreraId/{carreraId}")
	public ResponseEntity<?> eliminar(@PathVariable Long carreraId)
	{
		Optional<Carrera> oCarrera = carreraDao.buscarPorId(carreraId);
		
		if(!oCarrera.isPresent())
			throw new NotFoundException(String.format("La carrera con id: %d no existe", carreraId));
		
		carreraDao.eliminarPorId(carreraId);
		return new ResponseEntity<>("La carrera con id: " + carreraId + " fue eliminada", HttpStatus.NO_CONTENT);
	}
	
	@PutMapping("/carrera/actualizar/carreraId/{carreraId}")
	public ResponseEntity<?> actualizar(@PathVariable Long carreraId, @Valid @RequestBody Carrera carrera, BindingResult result)
	{
		Map<String, Object> validaciones = new HashMap<String, Object>();
		if(result.hasErrors())
		{
			List<String> listaErrores = result.getFieldErrors()
					.stream()
					.map(errores -> "Campo: '" + errores.getField() + "' " + errores.getDefaultMessage())
					.collect(Collectors.toList());
			validaciones.put("Lista Errores", listaErrores);
			return new ResponseEntity<Map<String, Object>>(validaciones, HttpStatus.BAD_REQUEST);
		}
		
		Carrera carreraActualizada = null;
		
		try
		{
			carreraActualizada = carreraDao.actualizar(carreraId, carrera);
		}
		catch (Exception e) 
		{
			throw e;
		}
		
		return new ResponseEntity<Carrera>(carreraActualizada, HttpStatus.OK);
	}
}
