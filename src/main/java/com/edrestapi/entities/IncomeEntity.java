package com.edrestapi.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class IncomeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer incomeId;
	private Double salaryIncome;
	private Double propertyIcome;
	private Double rentIncome;
	@OneToOne
	private IesAppsEntity appsEntity;
	
	public IncomeEntity() {
		// TODO Auto-generated constructor stub
	}

	public IncomeEntity(Integer incomeId, Double salaryIncome, Double propertyIcome, Double rentIncome,
			IesAppsEntity appsEntity) {
		super();
		this.incomeId = incomeId;
		this.salaryIncome = salaryIncome;
		this.propertyIcome = propertyIcome;
		this.rentIncome = rentIncome;
		this.appsEntity = appsEntity;
	}

	public Integer getIncomeId() {
		return incomeId;
	}

	public void setIncomeId(Integer incomeId) {
		this.incomeId = incomeId;
	}

	public Double getSalaryIncome() {
		return salaryIncome;
	}

	public void setSalaryIncome(Double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	public Double getPropertyIcome() {
		return propertyIcome;
	}

	public void setPropertyIcome(Double propertyIcome) {
		this.propertyIcome = propertyIcome;
	}

	public Double getRentIncome() {
		return rentIncome;
	}

	public void setRentIncome(Double rentIncome) {
		this.rentIncome = rentIncome;
	}

	public IesAppsEntity getAppsEntity() {
		return appsEntity;
	}

	public void setAppsEntity(IesAppsEntity appsEntity) {
		this.appsEntity = appsEntity;
	}
	
}
