package com.colegiows.rest.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.colegiows.rest.models.EstudianteModel;

@Repository
public interface EstudianteRepository extends CrudRepository<EstudianteModel, Long>{
	

}