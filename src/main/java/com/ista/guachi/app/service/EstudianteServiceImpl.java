package com.ista.guachi.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ista.guachi.app.model.Estudiante;
import com.ista.guachi.app.repository.EstudianteRepository;

@Service
public class EstudianteServiceImpl implements EstudianteService{
	@Autowired
	private EstudianteRepository estudianteRepository;

	@Override
	public List<Estudiante> findAll() {
		// TODO Auto-generated method stub
		return estudianteRepository.findAll();
	}

	@Override
	public Estudiante findByNumero(Long number) {
		// TODO Auto-generated method stub
		return estudianteRepository.findByNumero(number);
	}

	@Override
	public Estudiante findByCorreo(String correo) {
		// TODO Auto-generated method stub
		return estudianteRepository.findByCorreo(correo);
	}

	@Override
	public List<Estudiante> findAllByOrderByGpa() {
		// TODO Auto-generated method stub
		return estudianteRepository.findAllByOrderByGpa();
	}

	@Override
	public void saveOrUpdateEstudiante(Estudiante estudiante) {
		// TODO Auto-generated method stub
		estudianteRepository.save(estudiante);
	}

	@Override
	public void deleteEstudiante(String id) {
		// TODO Auto-generated method stub
		estudianteRepository.deleteById(id);
	}

}
