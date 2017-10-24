/*package com.shareidea.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "shareidea")
public class BaseEntity {
	@Id
	private long id;

	@Indexed(unique = true)
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
*/