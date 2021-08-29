package com.izipay.frank.app.alumno.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.izipay.frank.app.alumno.models.entity.Alumno;
import com.izipay.frank.app.alumno.repository.AlumnoRepository;

@Component
public class AlumnoLoader implements CommandLineRunner {
	
	@Autowired
	AlumnoRepository alumnoRepository;

	@Override
	public void run(String... args) throws Exception {
		loadTodos();		
	}
	
	private void loadTodos() {
        if (alumnoRepository.count() == 0) {
        	alumnoRepository.save(
                    Alumno.builder()
                            .nombre("Frank")
                            .apellido("Laura Borja")
                            .email("frank.cg9@gmail.com")
                            .dni(73191639)
                            .build()
            );
        	alumnoRepository.save(
        			Alumno.builder()
	                    .nombre("Thiago Fabian")
	                    .apellido("Laura Ayala")
	                    .email("tlaura.19@gmail.com")
	                    .dni(92455122)
	                    .build()
            );
            System.out.println("Carga de Alumnos");
        }
    }
	
	
}
