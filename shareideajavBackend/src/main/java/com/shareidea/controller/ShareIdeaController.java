package com.shareidea.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shareidea.dao.BaseDao;
import com.shareidea.entity.BaseEntity;

@RestController
@RequestMapping("base")
public class ShareIdeaController {
	
	@Autowired
	private BaseDao ibaseDao;
	

	@GetMapping("getIdea")
	@Procedure("application/json")
	public ResponseEntity getArticleBy() {
		List<BaseEntity> listBaseDto = new ArrayList<BaseEntity>();
		listBaseDto = ibaseDao.findAll();
		return new ResponseEntity(listBaseDto, HttpStatus.OK);
	}
}
