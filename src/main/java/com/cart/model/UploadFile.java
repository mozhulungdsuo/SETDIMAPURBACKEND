package com.cart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="UploadFile")
public class UploadFile {

	@Id
	@GeneratedValue(generator="fil_sequence", strategy= GenerationType.SEQUENCE)
	@SequenceGenerator(name="fil_sequence", sequenceName="fil_seq", initialValue=1, allocationSize=1)
	@Column(name = "FILE_ID")
	private int id;

	@Column(name = "FILE_NAME")
	private String fileName;

	@Lob // to store some image files, Large Object
	@Column(name = "FILE_DATA")
	private byte[] data;

	private String userName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
