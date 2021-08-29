package com.izipay.frank.app.alumno.services;

import java.util.Optional;

import com.izipay.frank.app.alumno.models.entity.Alumno;

public interface AlumnoService {	
	
	Iterable<Alumno> getAlumnos();

	Optional<Alumno> getAlumnoById(Long id);

	Alumno saveAlumno(Alumno alumno);

    void deleteAlumno(Long id);

}
