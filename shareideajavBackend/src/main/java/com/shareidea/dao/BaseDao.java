package com.shareidea.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.shareidea.entity.Shareidea;

@Repository
public interface BaseDao extends MongoRepository<Shareidea, String> {
	
	//List<Shareidea> findAll();
/*	List<BaseEntity> findByIdeaName(String ideaName);

	List<BaseEntity> findByIdea(String idea);

	BaseEntity create(BaseEntity baseEntity);

	BaseEntity update(BaseEntity baseEntity);
*/
}
