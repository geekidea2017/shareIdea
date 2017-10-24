package com.shareidea.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shareidea.dao.BaseDao;
import com.shareidea.entity.Article;
import com.shareidea.entity.Shareidea;

@RestController
@RequestMapping("base")
public class ShareIdeaController {
	
	@Autowired
	private BaseDao ibaseDao;
	

	@GetMapping("getIdea")
	@Procedure("application/json")
	public ResponseEntity<List<Shareidea>> getIdea() {
		List<Shareidea> listBaseDto = new ArrayList<Shareidea>();
		listBaseDto = ibaseDao.findAll();
		return new ResponseEntity<List<Shareidea>>(listBaseDto, HttpStatus.OK);
	}
	
	@PostMapping("postIdea")
	@Procedure("application/json")
	public ResponseEntity<Shareidea> postIdea(@RequestBody Shareidea shareIdea) {
		//List<Shareidea> listBaseDto = new ArrayList<Shareidea>();
		//ibaseDao.insert(shareIdea);
		return new ResponseEntity<Shareidea>(ibaseDao.insert(shareIdea), HttpStatus.OK);
	}
}
