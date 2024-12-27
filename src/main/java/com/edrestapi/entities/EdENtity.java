package com.edrestapi.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class EdEntity {
	private Integer edtraceId;

	private String planName;
	private String planStatus;
	private LocalDateTime eligStartDate;
	private LocalDateTime eligEndDate;
	private Double benfitAmt;
	private String denialReason;
	@OneToMany()
	private CoNoticeEntity coNoticeEntity;
	@OneToOne
	private IesAppsEntity appsEntity;

	public EdEntity() {
		// TODO Auto-generated constructor stub
	}

	public EdEntity(Integer edtraceId, String planName, String planStatus, LocalDateTime eligStartDate,
			LocalDateTime eligEndDate, Double benfitAmt, String denialReason, CoNoticeEntity coNoticeEntity,
			IesAppsEntity appsEntity) {
		super();
		this.edtraceId = edtraceId;
		this.planName = planName;
		this.planStatus = planStatus;
		this.eligStartDate = eligStartDate;
		this.eligEndDate = eligEndDate;
		this.benfitAmt = benfitAmt;
		this.denialReason = denialReason;
		this.coNoticeEntity = coNoticeEntity;
		this.appsEntity = appsEntity;
	}

	public Integer getEdtraceId() {
		return edtraceId;
	}

	public void setEdtraceId(Integer edtraceId) {
		this.edtraceId = edtraceId;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPlanStatus() {
		return planStatus;
	}

	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}

	public LocalDateTime getEligStartDate() {
		return eligStartDate;
	}

	public void setEligStartDate(LocalDateTime eligStartDate) {
		this.eligStartDate = eligStartDate;
	}

	public LocalDateTime getEligEndDate() {
		return eligEndDate;
	}

	public void setEligEndDate(LocalDateTime eligEndDate) {
		this.eligEndDate = eligEndDate;
	}

	public Double getBenfitAmt() {
		return benfitAmt;
	}

	public void setBenfitAmt(Double benfitAmt) {
		this.benfitAmt = benfitAmt;
	}

	public String getDenialReason() {
		return denialReason;
	}

	public void setDenialReason(String denialReason) {
		this.denialReason = denialReason;
	}

	public CoNoticeEntity getCoNoticeEntity() {
		return coNoticeEntity;
	}

	public void setCoNoticeEntity(CoNoticeEntity coNoticeEntity) {
		this.coNoticeEntity = coNoticeEntity;
	}

	public IesAppsEntity getAppsEntity() {
		return appsEntity;
	}

	public void setAppsEntity(IesAppsEntity appsEntity) {
		this.appsEntity = appsEntity;
	}
	
	
}
