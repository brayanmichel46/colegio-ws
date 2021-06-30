package com.colegiows.rest.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colegiows.rest.repositories.CursoRepository;

@Service
public class CursoService {
	
	@Autowired
	CursoRepository cursoRepository;
	
}
