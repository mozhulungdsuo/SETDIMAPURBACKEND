package com.cart.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="C_JobApp")
@Component
public class JobApplication {

	@Id
	@GeneratedValue(generator="jobapp_sequence", strategy= GenerationType.SEQUENCE)
	@SequenceGenerator(name="jobapp_sequence", sequenceName="jobapp_seq", initialValue=1, allocationSize=1)
	private int jobAppId;
	private String status;
	private String appliedBy;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "jobId")
	private Job job;

	public int getJobAppId() {
		return jobAppId;
	}

	public void setJobAppId(int jobAppId) {
		this.jobAppId = jobAppId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAppliedBy() {
		return appliedBy;
	}

	public void setAppliedBy(String appliedBy) {
		this.appliedBy = appliedBy;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

}
