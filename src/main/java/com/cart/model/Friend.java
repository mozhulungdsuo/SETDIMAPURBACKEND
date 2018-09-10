package com.cart.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="C_Friend")
@Component
public class Friend extends BaseDomain {
	@Id
	@GeneratedValue(generator="friend_sequence", strategy= GenerationType.SEQUENCE)
	@SequenceGenerator(name="friend_sequence", sequenceName="friend_seq", initialValue=1, allocationSize=1)
	private int id;
	// user can accept or reject friendrequest
	private char status;
	private char isOnline;
	private String friendId;
	private String userID;

	public Friend() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public char getIsOnline() {
		return isOnline;
	}

	public void setIsOnline(char isOnline) {
		this.isOnline = isOnline;
	}

	public String getFriendId() {
		return friendId;
	}

	public void setFriendId(String friendId) {
		this.friendId = friendId;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

}
