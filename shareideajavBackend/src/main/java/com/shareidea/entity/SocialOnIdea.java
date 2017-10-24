package com.shareidea.entity;

public class SocialOnIdea {

	private Integer likes;
	private Integer dislike;
	private Integer views;
	private Integer stared;

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public Integer getDislike() {
		return dislike;
	}

	public void setDislike(Integer dislike) {
		this.dislike = dislike;
	}

	public Integer getViews() {
		return views;
	}

	public void setViews(Integer views) {
		this.views = views;
	}

	public Integer getStared() {
		return stared;
	}

	public void setStared(Integer stared) {
		this.stared = stared;
	}

	@Override
	public String toString() {
		return "SocialOnIdea [likes=" + likes + ", dislike=" + dislike + ", views=" + views + ", stared=" + stared
				+ "]";
	}

}
