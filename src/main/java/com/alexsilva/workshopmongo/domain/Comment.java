package com.alexsilva.workshopmongo.domain;

import java.time.Instant;
import java.util.Objects;


public class Comment {
	
	private String id;
	private String text;
	private Instant date;
	
	private Post posts;
	private User author;
	
	public Comment() {
	}

	public Comment(String id, String text, Instant date, Post posts, User author) {
		super();
		this.id = id;
		this.text = text;
		this.date = date;
		this.posts = posts;
		this.author = author;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Instant getDate() {
		return date;
	}

	public void setDate(Instant date) {
		this.date = date;
	}

	public Post getPosts() {
		return posts;
	}

	public void setPosts(Post posts) {
		this.posts = posts;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comment other = (Comment) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
}
