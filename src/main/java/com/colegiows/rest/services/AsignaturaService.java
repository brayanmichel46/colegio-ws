package com.colegiows.rest.services;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colegiows.rest.repositories.AsignaturaRepository;

@Service
public class AsignaturaService{
	
	@Autowired
	AsignaturaRepository asignaturaRepository;
	
	public List<Map<String,Object>> getCursos(int prof) {
		List<Map<String,Object>> list = asignaturaRepository.getCursos(prof);
		return list;
	}				
}
