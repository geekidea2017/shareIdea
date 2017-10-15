package com.shareidea.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.shareidea.entity.BaseEntity;

public interface IBaseDao extends MongoRepository<BaseEntity, Long> {

	List<BaseEntity> findByIdeaName(String ideaName);

	List<BaseEntity> findByIdea(String idea);

	BaseEntity create(BaseEntity baseEntity);

	BaseEntity update(BaseEntity baseEntity);

}
