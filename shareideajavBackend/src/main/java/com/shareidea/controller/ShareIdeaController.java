package com.shareidea.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shareidea.dto.ShareideaDto;
import com.shareidea.service.ILandingPageService;

@RestController
@RequestMapping("base")
public class ShareIdeaController {

	@Autowired
	private ILandingPageService landingPageService;

	@GetMapping("getIdea")
	@Procedure("application/json")
	public ResponseEntity<List<ShareideaDto>> getIdea() {
		return landingPageService.getIdea();
	}

	@PostMapping("postIdea")
	@Procedure("application/json")
	public ResponseEntity<ShareideaDto> postIdea(@RequestBody ShareideaDto shareIdeaDto) {
		return landingPageService.postIdea(shareIdeaDto);
	}
}
