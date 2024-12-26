package com.edrestapi.bindingclasses;


import java.time.LocalDateTime;

public class EdResponse {

    private String planName;
    private String planStatus;
    private LocalDateTime planStartDate;
    private LocalDateTime planEndDate;
    private String benfitAmt;
    private String denialReason;

    public EdResponse() {
    }

    public EdResponse(String planName, String denialReason, String benfitAmt, LocalDateTime planEndDate, LocalDateTime planStartDate, String planStatus) {
        this.planName = planName;
        this.denialReason = denialReason;
        this.benfitAmt = benfitAmt;
        this.planEndDate = planEndDate;
        this.planStartDate = planStartDate;
        this.planStatus = planStatus;
    }

    public String getPlanName() {
        return planName;
    }

    public String getPlanStatus() {
        return planStatus;
    }

    public LocalDateTime getPlanStartDate() {
        return planStartDate;
    }

    public LocalDateTime getPlanEndDate() {
        return planEndDate;
    }

    public String getBenfitAmt() {
        return benfitAmt;
    }

    public String getDenialReason() {
        return denialReason;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public void setPlanStatus(String planStatus) {
        this.planStatus = planStatus;
    }

    public void setPlanStartDate(LocalDateTime planStartDate) {
        this.planStartDate = planStartDate;
    }

    public void setPlanEndDate(LocalDateTime planEndDate) {
        this.planEndDate = planEndDate;
    }

    public void setBenfitAmt(String benfitAmt) {
        this.benfitAmt = benfitAmt;
    }

    public void setDenialReason(String denialReason) {
        this.denialReason = denialReason;
    }
}
