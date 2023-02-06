package com.ista.guachi.app.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ista.guachi.app.model.Estudiante;

public interface EstudianteRepository extends MongoRepository<Estudiante, String>{
	Estudiante findByNumero(long number);
	Estudiante findByCorreo(String correo);
	List<Estudiante> findAllByOrderByGpa();
}
