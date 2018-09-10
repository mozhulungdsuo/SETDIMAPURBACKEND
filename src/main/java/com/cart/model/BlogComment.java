package com.cart.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="C_BlogComment")
@Component
public class BlogComment {

	@Id
	@GeneratedValue(generator="blogcomment_sequence", strategy= GenerationType.SEQUENCE)
	@SequenceGenerator(name="blogcomment_sequence", sequenceName="blogcomment_seq", initialValue=1, allocationSize=1)
	private int commentId;
	private String comments;
	private String commentedDate;
	private String blogId;
	private String userId;

	public int getCommentId() {
		return commentId;
	}

	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}

	public String getComment() {
		return comments;
	}

	public void setComment(String comment) {
		this.comments = comment;
	}

	public String getCommentedDate() {
		return commentedDate;
	}

	public void setCommentedDate(String commentedDate) {
		this.commentedDate = commentedDate;
	}

	public String getBlogId() {
		return blogId;
	}

	public void setBlogId(String blogId) {
		this.blogId = blogId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	
}
