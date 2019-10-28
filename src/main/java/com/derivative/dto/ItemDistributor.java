package com.derivative.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties

@Entity
@Table(name = "ItemDistributorMapping")
public class ItemDistributor {

	@Id
	@GeneratedValue
    private long id;	
	@Column(name = "itemCode")
	private Long itemCode;
	@Column(name="distributorcode")
	private Long distributorcode   ;
	public Long getItemCode() {
		return itemCode;
	}
	public void setItemCode(Long itemCode) {
		this.itemCode = itemCode;
	}
	public Long getDistributorcode() {
		return distributorcode;
	}
	public void setDistributorcode(Long distributorcode) {
		this.distributorcode = distributorcode;
	}
	
}
