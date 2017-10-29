package com.datapeople.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private  long id;
	
	//?????????
	private long streetId;
	
	@Column(name="number_home")
	private String houseNumber;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getStreetId() {
		return streetId;
	}
	public void setStreetId(long streetId) {
		this.streetId = streetId;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	
	@Override
	public String toString() {
		return "Address [id=" + id + ", streetId=" + streetId + ", houseNumber=" + houseNumber + "]";
	}
}
