package com.shareidea.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.shareidea.dto.ShareideaDto;

public interface ILandingPageService {
	ResponseEntity<List<ShareideaDto>> getIdea();
	ResponseEntity<ShareideaDto> postIdea(ShareideaDto shareideaDto);
}
