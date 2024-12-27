package com.edrestapi.entities;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class IesAppsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long caseNo;
	private String fullName;
	private String phoneNO;
	private LocalDateTime dob;
	private String gender;
	private String email;
	private String ssn;
//	@ManyToOne
//	@JoinColumn(name = "user_id")
//	private UserEntity user;
	private Integer createdBy;
	@Column(updatable = false)
	@CreationTimestamp
	private LocalDateTime createdAt;
	@Column(insertable = false)
	@UpdateTimestamp
	private LocalDateTime updatedAt;
	private Integer updatedBy;

	@OneToOne(mappedBy = "appsEntity")
	@JoinColumn(name = "case_no")
	private IncomeEntity entity;

	@OneToOne(mappedBy = "appsEntity")
	@JoinColumn(name = "case_no")
	private EducationEntity educationEntity;

	@OneToOne(mappedBy = "appsEntity")
	@JoinColumn(name = "case_no")
	private KidsEntity kidsEntity;

	@OneToOne(mappedBy = "appsEntity")
	@JoinColumn(name = "case_no")
	private PlanSelectionEntity planSelectionEntity;
	
	@OneToOne(mappedBy = "appsEntity")
	@JoinColumn(name = "case_no")
	private EdEntity edEntity;
	
	@OneToMany(mappedBy = "appsEntity")
	@JoinColumn(name = "case_no")
	private CoNoticeEntity coNoticeEntity;
	
	public IesAppsEntity() {
		// TODO Auto-generated constructor stub
	}

	public IesAppsEntity(Long caseNo, String fullName, String phoneNO, LocalDateTime dob, String gender, String email,
			String ssn, Integer createdBy, LocalDateTime createdAt, LocalDateTime updatedAt, Integer updatedBy,
			IncomeEntity entity, EducationEntity educationEntity, KidsEntity kidsEntity,
			PlanSelectionEntity planSelectionEntity, EdEntity edEntity, CoNoticeEntity coNoticeEntity) {
		super();
		this.caseNo = caseNo;
		this.fullName = fullName;
		this.phoneNO = phoneNO;
		this.dob = dob;
		this.gender = gender;
		this.email = email;
		this.ssn = ssn;
		this.createdBy = createdBy;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.updatedBy = updatedBy;
		this.entity = entity;
		this.educationEntity = educationEntity;
		this.kidsEntity = kidsEntity;
		this.planSelectionEntity = planSelectionEntity;
		this.edEntity = edEntity;
		this.coNoticeEntity = coNoticeEntity;
	}

	public Long getCaseNo() {
		return caseNo;
	}

	public void setCaseNo(Long caseNo) {
		this.caseNo = caseNo;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhoneNO() {
		return phoneNO;
	}

	public void setPhoneNO(String phoneNO) {
		this.phoneNO = phoneNO;
	}

	public LocalDateTime getDob() {
		return dob;
	}

	public void setDob(LocalDateTime dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Integer getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}

	public IncomeEntity getEntity() {
		return entity;
	}

	public void setEntity(IncomeEntity entity) {
		this.entity = entity;
	}

	public EducationEntity getEducationEntity() {
		return educationEntity;
	}

	public void setEducationEntity(EducationEntity educationEntity) {
		this.educationEntity = educationEntity;
	}

	public KidsEntity getKidsEntity() {
		return kidsEntity;
	}

	public void setKidsEntity(KidsEntity kidsEntity) {
		this.kidsEntity = kidsEntity;
	}

	public PlanSelectionEntity getPlanSelectionEntity() {
		return planSelectionEntity;
	}

	public void setPlanSelectionEntity(PlanSelectionEntity planSelectionEntity) {
		this.planSelectionEntity = planSelectionEntity;
	}

	public EdEntity getEdEntity() {
		return edEntity;
	}

	public void setEdEntity(EdEntity edEntity) {
		this.edEntity = edEntity;
	}

	public CoNoticeEntity getCoNoticeEntity() {
		return coNoticeEntity;
	}

	public void setCoNoticeEntity(CoNoticeEntity coNoticeEntity) {
		this.coNoticeEntity = coNoticeEntity;
	}
	
	
}
