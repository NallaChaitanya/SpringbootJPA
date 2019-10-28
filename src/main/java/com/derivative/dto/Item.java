package com.derivative.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

@Entity
@Table(name = "Item")
public class Item {

	@Id
	private Long itemCode;
	
	@Column(name = "itemDesc")
	private String itemDesc;
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
	public String getItemDesc() {
		return itemDesc;
	}
	public Long getItemCode() {
		return itemCode;
	}
	public void setItemCode(Long itemCode) {
		this.itemCode = itemCode;
	}
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	
	public String getAuditId() {
		return auditId;
	}
	public void setAuditId(String auditId) {
		this.auditId = auditId;
	}
	@Override
	public String toString() {
		return "ItemDto [itemCode=" + itemCode + ", itemDesc=" + itemDesc + ", auditId=" + auditId + "]";
	}
	
	
	
}
