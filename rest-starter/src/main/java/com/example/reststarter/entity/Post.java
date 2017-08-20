package com.example.reststarter.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Post {
	@Id
	@GeneratedValue
	private Long id;
	private String title;
	private String body;
	private Date postedOn;
	
	@ManyToOne
	private Author author;

	public Post() {
	}

	public Post(String title, String body, Date postedOn) {
		super();
		this.title = title;
		this.body = body;
		this.postedOn = postedOn;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Date getPostedOn() {
		return postedOn;
	}

	public void setPostedOn(Date postedOn) {
		this.postedOn = postedOn;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return String.format("Post [id=%s, title=%s, body=%s, postedOn=%s]", id, title, body, postedOn);
	}

}
