package com.cart.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "C_Blog")
@Component
public class Blog extends BaseDomain {
	@Id
	@GeneratedValue(generator="blog_sequence", strategy= GenerationType.SEQUENCE)
	@SequenceGenerator(name="blog_sequence", sequenceName="blog_seq", initialValue=1, allocationSize=1)
	private int blogId;
	private String title;
	private String description;
	private String userId;
	private String blogCreatedDate;
	private String status;
	private String reason;
	private int likes;
	private int dislikes;

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public int getDislikes() {
		return dislikes;
	}

	public void setDislikes(int dislikes) {
		this.dislikes = dislikes;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserId() {
		return userId;
	}

	public int getBlogId() {
		return blogId;
	}

	public void setBlogId(int blogId) {
		this.blogId = blogId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBlogCreatedDate() {
		return blogCreatedDate;
	}

	public void setBlogCreatedDate(String blogCreatedDate) {
		this.blogCreatedDate = blogCreatedDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
