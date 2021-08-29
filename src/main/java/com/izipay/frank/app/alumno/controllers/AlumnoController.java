package com.izipay.frank.app.alumno.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.izipay.frank.app.alumno.models.entity.Alumno;
import com.izipay.frank.app.alumno.services.AlumnoService;

@RestController
@RequestMapping("/api/v1/alumno")
public class AlumnoController {
	
	@Autowired
	private AlumnoService alumnoService;
	
	@GetMapping
	public ResponseEntity<?> getAllAlumnos(){		
		return ResponseEntity.ok().body(alumnoService.getAlumnos());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getAlumno(@PathVariable Long id){
		Optional<Alumno> a = alumnoService.getAlumnoById(id);
		if(!a.isPresent())
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok(a.get());
	}
	
	@PostMapping
	public ResponseEntity<?> saveAlumno(@RequestBody Alumno alumno){
		Alumno alumnoDb = alumnoService.saveAlumno(alumno);
		return ResponseEntity.status(HttpStatus.CREATED).body(alumnoDb);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateAlumno(@RequestBody Alumno alumno, @PathVariable Long id){
		Optional<Alumno> a = alumnoService.getAlumnoById(id);
		if(!a.isPresent())
			return ResponseEntity.notFound().build();
		
		Alumno alumnoDb = a.get();		
		alumnoDb.setNombre(alumno.getNombre());
		alumnoDb.setApellido(alumno.getApellido());
		alumnoDb.setEmail(alumno.getEmail());
		alumnoDb.setDni(alumno.getDni());
		return ResponseEntity.status(HttpStatus.CREATED).body(alumnoService.saveAlumno(alumnoDb));		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteAlumno(@PathVariable Long id){
		alumnoService.deleteAlumno(id);
		return ResponseEntity.noContent().build();
	}	

}
