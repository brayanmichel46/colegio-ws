package com.colegiows.rest.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.colegiows.rest.models.ProfesorModel;
import com.colegiows.rest.services.ProfesorService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/profesor")
public class ProfesorController {
	@Autowired
	ProfesorService profesorService;
	
	@GetMapping()
	public ArrayList<ProfesorModel> getProfesor(){
		return profesorService.getProfesores();
	}
}
