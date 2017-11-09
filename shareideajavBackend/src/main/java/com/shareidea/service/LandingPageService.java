package com.shareidea.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.shareidea.dao.BaseDao;
import com.shareidea.dto.ShareideaDto;
import com.shareidea.dto.SocialOnIdeaDto;
import com.shareidea.entity.Shareidea;
import com.shareidea.entity.SocialOnIdea;

@Service
public class LandingPageService implements ILandingPageService {
	@Autowired
	private BaseDao ibaseDao;

	@Override
	public ResponseEntity<List<ShareideaDto>> getIdea() {

		List<Shareidea> listBase = new ArrayList<Shareidea>();
		listBase = ibaseDao.findAll();
		List<ShareideaDto> listBaseDto = new ArrayList<ShareideaDto>();
		if (!listBase.isEmpty()) {
			for (Shareidea shareidea : listBase) {
				ShareideaDto shareIdeaDto = new ShareideaDto();
				shareIdeaDto.setDescription(shareidea.getDescription());
				shareIdeaDto.setIdeaBy(shareidea.getIdeaBy());
				shareIdeaDto.setIdeaByEmailId(shareidea.getIdeaByEmailId());
				shareIdeaDto.setIdeaByImage(shareidea.getIdeaByImage());
				shareIdeaDto.setLinks(shareidea.getLinks());
				shareIdeaDto.setName(shareidea.getName());
				shareIdeaDto.setPostedDate(shareidea.getPostedDate());
				SocialOnIdeaDto socialOnIdea = new SocialOnIdeaDto();
				socialOnIdea.setDislike(shareidea.getSocialOnIdea().getDislike());
				socialOnIdea.setLikes(shareidea.getSocialOnIdea().getLikes());
				socialOnIdea.setStared(shareidea.getSocialOnIdea().getStared());
				socialOnIdea.setViews(shareidea.getSocialOnIdea().getViews());
				shareIdeaDto.setSocialOnIdea(socialOnIdea);
				listBaseDto.add(shareIdeaDto);

			}
			return new ResponseEntity<List<ShareideaDto>>(listBaseDto, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<ShareideaDto>>(listBaseDto, HttpStatus.NO_CONTENT);

		}

	}

	@Override
	public ResponseEntity<ShareideaDto> postIdea(ShareideaDto shareideaDto) {
		if (shareideaDto != null) {

			Shareidea shareIdea = new Shareidea();
			shareIdea.setDescription(shareideaDto.getDescription());
			shareIdea.setIdeaBy(shareideaDto.getIdeaBy());
			shareIdea.setIdeaByEmailId(shareideaDto.getIdeaByEmailId());
			shareIdea.setIdeaByImage(shareideaDto.getIdeaByImage());
			shareIdea.setLinks(shareideaDto.getLinks());
			shareIdea.setName(shareideaDto.getName());
			shareIdea.setPostedDate(shareideaDto.getPostedDate());
			SocialOnIdea socialOnIdea = new SocialOnIdea();
			socialOnIdea.setDislike(shareideaDto.getSocialOnIdea().getDislike());
			socialOnIdea.setLikes(shareideaDto.getSocialOnIdea().getLikes());
			socialOnIdea.setStared(shareideaDto.getSocialOnIdea().getStared());
			socialOnIdea.setViews(shareideaDto.getSocialOnIdea().getViews());
			shareIdea.setSocialOnIdea(socialOnIdea);

			ibaseDao.insert(shareIdea);
			return new ResponseEntity<ShareideaDto>(shareideaDto, HttpStatus.OK);

		} else {
			return new ResponseEntity<ShareideaDto>(shareideaDto, HttpStatus.NOT_ACCEPTABLE);
		}

	}

}
