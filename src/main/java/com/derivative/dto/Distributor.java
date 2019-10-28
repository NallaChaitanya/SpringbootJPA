package com.derivative.dto;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
@Entity
@Table(name = "Distributor")

public class Distributor {
	
	@Id
private Long distributorcode   ;
	
@Column(name = "distributordesc")
	private String distributordesc;
	//private String createdDate;
	@Column(name = "auditId")
	private String auditId;
	
	@Column(name = "createddate",nullable = false, updatable = false)
	@CreationTimestamp
	private Date createddate;
	
	
	public Date getCreateddate() {
		return createddate;
	}
	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}
	public Long getDistributorcode() {
		return distributorcode;
	}
	public void setDistributorcode(Long distributorcode) {
		this.distributorcode = distributorcode;
	}
	
	public String getDistributordesc() {
		return distributordesc;
	}
	public void setDistributordesc(String distributordesc) {
		this.distributordesc = distributordesc;
	}
	public String getAuditId() {
		return auditId;
	}
	public void setAuditId(String auditId) {
		this.auditId = auditId;
	}
	@Override
	public String toString() {
		return "Distributor [distributorcode=" + distributorcode + ", distributordesc=" + distributordesc + ", auditId="
				+ auditId + ", createddate=" + createddate + "]";
	}
	
	
	
	

}
