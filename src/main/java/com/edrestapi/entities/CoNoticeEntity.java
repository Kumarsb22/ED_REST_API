package com.edrestapi.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class CoNoticeEntity {
private Integer noticeId;
private String copdfS3Url;
private LocalDateTime printDate;
private String noticeStatus;
private LocalDateTime createdDate;
@ManyToOne
@JoinColumn(name = "ed_trace_id")
private EdEntity edEntity;
@ManyToOne
private IesAppsEntity appsEntity;

public CoNoticeEntity() {
	// TODO Auto-generated constructor stub
}

public CoNoticeEntity(Integer noticeId, String copdfS3Url, LocalDateTime printDate, String noticeStatus,
		LocalDateTime createdDate, EdEntity edEntity, IesAppsEntity appsEntity) {
	super();
	this.noticeId = noticeId;
	this.copdfS3Url = copdfS3Url;
	this.printDate = printDate;
	this.noticeStatus = noticeStatus;
	this.createdDate = createdDate;
	this.edEntity = edEntity;
	this.appsEntity = appsEntity;
}

public Integer getNoticeId() {
	return noticeId;
}

public void setNoticeId(Integer noticeId) {
	this.noticeId = noticeId;
}

public String getCopdfS3Url() {
	return copdfS3Url;
}

public void setCopdfS3Url(String copdfS3Url) {
	this.copdfS3Url = copdfS3Url;
}

public LocalDateTime getPrintDate() {
	return printDate;
}

public void setPrintDate(LocalDateTime printDate) {
	this.printDate = printDate;
}

public String getNoticeStatus() {
	return noticeStatus;
}

public void setNoticeStatus(String noticeStatus) {
	this.noticeStatus = noticeStatus;
}

public LocalDateTime getCreatedDate() {
	return createdDate;
}

public void setCreatedDate(LocalDateTime createdDate) {
	this.createdDate = createdDate;
}

public EdEntity getEdEntity() {
	return edEntity;
}

public void setEdEntity(EdEntity edEntity) {
	this.edEntity = edEntity;
}

public IesAppsEntity getAppsEntity() {
	return appsEntity;
}

public void setAppsEntity(IesAppsEntity appsEntity) {
	this.appsEntity = appsEntity;
}

}
