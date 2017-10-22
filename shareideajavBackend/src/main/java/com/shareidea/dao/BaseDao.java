package com.shareidea.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.shareidea.entity.BaseEntity;

@Repository
public interface BaseDao extends MongoRepository<BaseEntity, String> {
	
	List<BaseEntity> findAll();
/*	List<BaseEntity> findByIdeaName(String ideaName);

	List<BaseEntity> findByIdea(String idea);

	BaseEntity create(BaseEntity baseEntity);

	BaseEntity update(BaseEntity baseEntity);
*/
}
