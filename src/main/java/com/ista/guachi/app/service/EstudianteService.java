package com.ista.guachi.app.service;

import java.util.List;

import com.ista.guachi.app.model.Estudiante;

public interface EstudianteService {
	List<Estudiante> findAll();
	Estudiante findByNumero(Long number);
	Estudiante findByCorreo(String correo);
	List<Estudiante> findAllByOrderByGpa();
	void saveOrUpdateEstudiante(Estudiante estudiante);
	void deleteEstudiante(String id);
}
