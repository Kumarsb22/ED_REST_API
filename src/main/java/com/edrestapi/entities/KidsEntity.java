package com.edrestapi.entities;

import java.time.LocalDateTime;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class KidsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer kidId;
	private String kidName;
	private LocalDateTime kidDob;
	@OneToOne
	private IesAppsEntity appsEntity;
	
	public KidsEntity() {
		// TODO Auto-generated constructor stub
	}

	public KidsEntity(Integer kidId, String kidName, LocalDateTime kidDob, IesAppsEntity appsEntity) {
		super();
		this.kidId = kidId;
		this.kidName = kidName;
		this.kidDob = kidDob;
		this.appsEntity = appsEntity;
	}

	public Integer getKidId() {
		return kidId;
	}

	public void setKidId(Integer kidId) {
		this.kidId = kidId;
	}

	public String getKidName() {
		return kidName;
	}

	public void setKidName(String kidName) {
		this.kidName = kidName;
	}

	public LocalDateTime getKidDob() {
		return kidDob;
	}

	public void setKidDob(LocalDateTime kidDob) {
		this.kidDob = kidDob;
	}

	public IesAppsEntity getAppsEntity() {
		return appsEntity;
	}

	public void setAppsEntity(IesAppsEntity appsEntity) {
		this.appsEntity = appsEntity;
	}
	
	
}
