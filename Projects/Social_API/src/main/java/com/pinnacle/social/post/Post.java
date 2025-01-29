package com.pinnacle.social.post;

import com.pinnacle.social.user.User;

public class Post {
	private String details;
	private String date;
	private long id;
	private User user;
	private String title;

	public Post(long id, String title, String details, String date,  User user) {
		this.details = details;
		this.date = date;
		this.id = id;
		this.user = user;
		this.title = title;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
