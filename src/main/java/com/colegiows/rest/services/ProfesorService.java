package com.colegiows.rest.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.colegiows.rest.models.ProfesorModel;
import com.colegiows.rest.repositories.ProfesorRepository;

@Service
public class ProfesorService {
	
	@Autowired
	ProfesorRepository profesorRepository;
	
	public ArrayList<ProfesorModel> getProfesores(){
		return (ArrayList<ProfesorModel>) profesorRepository.findAll();
	}
}
