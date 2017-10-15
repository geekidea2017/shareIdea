package com.shareidea.dto;

public class BaseDto {

	private long id;

	private String ideaName;

	private String idea;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIdeaName() {
		return ideaName;
	}

	public void setIdeaName(String ideaName) {
		this.ideaName = ideaName;
	}

	public String getIdea() {
		return idea;
	}

	public void setIdea(String idea) {
		this.idea = idea;
	}

	@Override
	public String toString() {
		return "BaseEntity [id=" + id + ", ideaName=" + ideaName + ", idea=" + idea + "]";
	}

}
