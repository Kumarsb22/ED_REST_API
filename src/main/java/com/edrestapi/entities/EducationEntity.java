package com.edrestapi.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class EducationEntity {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer educationId;
	private String highestDegree;
	private LocalDate graduationYear;
	private String university;
	@OneToOne
	private IesAppsEntity appsEntity;
	
	public EducationEntity() {
		// TODO Auto-generated constructor stub
	}

	public EducationEntity(Integer educationId, String highestDegree, LocalDate graduationYear, String university,
			IesAppsEntity appsEntity) {
		super();
		this.educationId = educationId;
		this.highestDegree = highestDegree;
		this.graduationYear = graduationYear;
		this.university = university;
		this.appsEntity = appsEntity;
	}

	public Integer getEducationId() {
		return educationId;
	}

	public void setEducationId(Integer educationId) {
		this.educationId = educationId;
	}

	public String getHighestDegree() {
		return highestDegree;
	}

	public void setHighestDegree(String highestDegree) {
		this.highestDegree = highestDegree;
	}

	public LocalDate getGraduationYear() {
		return graduationYear;
	}

	public void setGraduationYear(LocalDate graduationYear) {
		this.graduationYear = graduationYear;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public IesAppsEntity getAppsEntity() {
		return appsEntity;
	}

	public void setAppsEntity(IesAppsEntity appsEntity) {
		this.appsEntity = appsEntity;
	}
	
	
}
