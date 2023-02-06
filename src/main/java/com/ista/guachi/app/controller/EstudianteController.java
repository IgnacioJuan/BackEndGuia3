package com.ista.guachi.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ista.guachi.app.model.Estudiante;
import com.ista.guachi.app.service.EstudianteService;

@RestController
@RequestMapping("/estudiate")
public class EstudianteController {
	
	@Autowired
	private EstudianteService estudianteService;
	
	@GetMapping(value = "/")
	public List<Estudiante> findAll() {
		// TODO Auto-generated method stub
		return estudianteService.findAll();
	}

	@GetMapping(value = "/{number}")
	public Estudiante findByNumero(@PathVariable("number") Long number) {
		// TODO Auto-generated method stub
		return estudianteService.findByNumero(number);
	}

	@GetMapping(value = "/{correo}")
	public Estudiante findByCorreo(@PathVariable("correo") String correo) {
		// TODO Auto-generated method stub
		return estudianteService.findByCorreo(correo);
	}

	@GetMapping(value = "/orderbygpa")
	public List<Estudiante> findAllByOrderByGpa() {
		// TODO Auto-generated method stub
		return estudianteService.findAllByOrderByGpa();
	}

	@PostMapping(value = "/")
	public ResponseEntity<?> saveOrUpdateEstudiante(@RequestBody Estudiante estudiante) {
		// TODO Auto-generated method stub
		
		estudianteService.saveOrUpdateEstudiante(estudiante);
		return new ResponseEntity<>("Estudiante agregado con exito",HttpStatus.OK);
	}

	@DeleteMapping(value = "/{id}")
	public void borrarEstudiante(@PathVariable("id") String id) {
		// TODO Auto-generated method stub
		estudianteService.deleteEstudiante(id);
	}
	
}
