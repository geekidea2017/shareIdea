package com.shareidea.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shareidea.dao.IBaseDao;
import com.shareidea.dto.BaseDto;
import com.shareidea.entity.BaseEntity;

@Controller
@RequestMapping("base")
public class ShareIdeaController {
	@Autowired
	private IBaseDao baseDao;

	@GetMapping("getIdea")
	@Procedure("application/json")
	public ResponseEntity getArticleBy() {
		List<BaseEntity> listBaseDto = new ArrayList<BaseEntity>();
		listBaseDto = baseDao.findAll();
		return new ResponseEntity(listBaseDto, HttpStatus.OK);
	}
}
