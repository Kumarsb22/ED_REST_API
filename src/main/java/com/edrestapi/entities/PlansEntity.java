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
import jakarta.persistence.OneToOne;

@Entity
public class PlansEntity {

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer planId;
    private String planName;
    private LocalDateTime planStartDate;
    private LocalDateTime planEndDate;
    private String activeSw;
    @Column(insertable = false)
    @CreationTimestamp
    private LocalDateTime createdDate;
    @Column(insertable = false)
    @UpdateTimestamp
    private  LocalDateTime updatedDate;
    private Integer createdBy;
    private Integer updatedBy;
    @OneToOne(mappedBy = "plansEntity")
    @JoinColumn(name = "plan_id")
    private PlanSelectionEntity planSelectionEntity;
    public PlansEntity() {
		// TODO Auto-generated constructor stub
	}
	public PlansEntity(Integer planId, String planName, LocalDateTime planStartDate, LocalDateTime planEndDate,
			String activeSw, LocalDateTime createdDate, LocalDateTime updatedDate, Integer createdBy, Integer updatedBy,
			PlanSelectionEntity planSelectionEntity) {
		super();
		this.planId = planId;
		this.planName = planName;
		this.planStartDate = planStartDate;
		this.planEndDate = planEndDate;
		this.activeSw = activeSw;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.planSelectionEntity = planSelectionEntity;
	}
	public Integer getPlanId() {
		return planId;
	}
	public void setPlanId(Integer planId) {
		this.planId = planId;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public LocalDateTime getPlanStartDate() {
		return planStartDate;
	}
	public void setPlanStartDate(LocalDateTime planStartDate) {
		this.planStartDate = planStartDate;
	}
	public LocalDateTime getPlanEndDate() {
		return planEndDate;
	}
	public void setPlanEndDate(LocalDateTime planEndDate) {
		this.planEndDate = planEndDate;
	}
	public String getActiveSw() {
		return activeSw;
	}
	public void setActiveSw(String activeSw) {
		this.activeSw = activeSw;
	}
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}
	public Integer getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}
	public Integer getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}
	public PlanSelectionEntity getPlanSelectionEntity() {
		return planSelectionEntity;
	}
	public void setPlanSelectionEntity(PlanSelectionEntity planSelectionEntity) {
		this.planSelectionEntity = planSelectionEntity;
	}
    
    
}
