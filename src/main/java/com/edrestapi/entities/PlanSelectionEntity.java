package com.edrestapi.entities;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class PlanSelectionEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer planSelectionId;
	@OneToOne
	private PlansEntity plansEntity;
	@OneToOne
	private IesAppsEntity appsEntity;
	
	public PlanSelectionEntity() {
		// TODO Auto-generated constructor stub
	}

	public PlanSelectionEntity(Integer planSelectionId, PlansEntity plansEntity, IesAppsEntity appsEntity) {
		super();
		this.planSelectionId = planSelectionId;
		this.plansEntity = plansEntity;
		this.appsEntity = appsEntity;
	}

	public Integer getPlanSelectionId() {
		return planSelectionId;
	}

	public void setPlanSelectionId(Integer planSelectionId) {
		this.planSelectionId = planSelectionId;
	}

	public PlansEntity getPlansEntity() {
		return plansEntity;
	}

	public void setPlansEntity(PlansEntity plansEntity) {
		this.plansEntity = plansEntity;
	}

	public IesAppsEntity getAppsEntity() {
		return appsEntity;
	}

	public void setAppsEntity(IesAppsEntity appsEntity) {
		this.appsEntity = appsEntity;
	}
	
	
}
