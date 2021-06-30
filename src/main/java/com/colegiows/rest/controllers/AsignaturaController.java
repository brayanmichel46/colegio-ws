package com.colegiows.rest.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.colegiows.rest.services.AsignaturaService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/asignatura")
public class AsignaturaController {
	
	@Autowired
	AsignaturaService asignaturaService;
	
	
	@GetMapping(path = "profesor/{prof}")
	public List<Map<String,Object>> getCurso(@PathVariable("prof") int prof){
		return this.asignaturaService.getCursos(prof);
	}
		
}
