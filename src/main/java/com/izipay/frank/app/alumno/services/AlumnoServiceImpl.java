package com.izipay.frank.app.alumno.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.izipay.frank.app.alumno.models.entity.Alumno;
import com.izipay.frank.app.alumno.repository.AlumnoRepository;

@Service
public class AlumnoServiceImpl implements AlumnoService {
	
	@Autowired
	AlumnoRepository alumnoRepository;
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Alumno> getAlumnos() {
		return alumnoRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Alumno> getAlumnoById(Long id) {
		return alumnoRepository.findById(id);
	}

	@Override
	@Transactional
	public Alumno saveAlumno(Alumno alumno) {
		return alumnoRepository.save(alumno);
	}

	@Override
	@Transactional
	public void deleteAlumno(Long id) {
		alumnoRepository.deleteById(id);

	}

}
