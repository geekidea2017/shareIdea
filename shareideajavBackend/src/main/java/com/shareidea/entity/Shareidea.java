package com.shareidea.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "shareidea")
public class Shareidea {
	@Id
	//@Indexed(unique = true)
	private String name;

	private String description;
	private String links;
	private String ideaBy;
	private String postedDate;
	private String ideaByEmailId;
	private String ideaByImage;
	private SocialOnIdea socialOnIdea;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLinks() {
		return links;
	}

	public void setLinks(String links) {
		this.links = links;
	}

	public String getIdeaBy() {
		return ideaBy;
	}

	public void setIdeaBy(String ideaBy) {
		this.ideaBy = ideaBy;
	}

	public String getPostedDate() {
		return postedDate;
	}

	public void setPostedDate(String postedDate) {
		this.postedDate = postedDate;
	}

	public String getIdeaByEmailId() {
		return ideaByEmailId;
	}

	public void setIdeaByEmailId(String ideaByEmailId) {
		this.ideaByEmailId = ideaByEmailId;
	}

	public String getIdeaByImage() {
		return ideaByImage;
	}

	public void setIdeaByImage(String ideaByImage) {
		this.ideaByImage = ideaByImage;
	}

	public SocialOnIdea getSocialOnIdea() {
		return socialOnIdea;
	}

	public void setSocialOnIdea(SocialOnIdea socialOnIdea) {
		this.socialOnIdea = socialOnIdea;
	}

	@Override
	public String toString() {
		return "Shareidea [name=" + name + ", description=" + description + ", links=" + links + ", ideaBy=" + ideaBy
				+ ", postedDate=" + postedDate + ", ideaByEmailId=" + ideaByEmailId + ", ideaByImage=" + ideaByImage
				+ ", socialOnIdea=" + socialOnIdea + "]";
	}

}
