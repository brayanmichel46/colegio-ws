package com.colegiows.rest.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.colegiows.rest.models.CursoModel;

@Repository
public interface CursoRepository extends CrudRepository<CursoModel, Long>{
	

}
