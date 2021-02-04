package com.student.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT_DETAILS")
public class StudentEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	
    @Column(name = "first_name")
	public String firstName;
	
	@Column(name = "branch")
	public String branch;
	
	@Column(name = "last_name")
	public String lastName;
	
    @Column(name = "email_id", nullable = false, length = 100)
	public String emailId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public StudentEntity(Long id, String firstName, String branch, String lastName, String emailId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.branch = branch;
		this.lastName = lastName;
		this.emailId = emailId;
	}
	
	public StudentEntity() {}
	
	@Override
	public String toString() {
		return "StudentEntity [id=" + id + ", firstName=" + firstName + ", branch=" + branch + ", lastName=" + lastName
				+ ", emailId=" + emailId + "]";
	}
    
    

}
