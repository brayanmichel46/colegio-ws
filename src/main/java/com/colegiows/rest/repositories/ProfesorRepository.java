package com.colegiows.rest.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.colegiows.rest.models.ProfesorModel;

@Repository
public interface ProfesorRepository extends CrudRepository<ProfesorModel, Long>{
	
	@Query(value="select "
			+ "distinct "
			+ "p.id, "
			+ "p.nombre "
			+ "from "
			+ "profesor p "
			+ "order by p.nombre",nativeQuery = true)
	List<Map<String,Object>> getProfesores(int col);
	
}
