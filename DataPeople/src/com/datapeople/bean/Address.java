package com.datapeople.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="address")
public class Address {
	
	/*@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)*/
	
	@Id
	@GenericGenerator(name="hilo-strategy", strategy = "hilo")
	@GeneratedValue(generator = "hilo-strategy")
	
	@Column(name="id")
	private  long id;
	
	@OneToOne
	@JoinColumn(name="streetid_id")
	private Street street;

	
	@Column(name="number_home")
	private int houseNumber;
	
	@OneToOne(mappedBy="adress")
	private Human human;
	


	public Street getStreet() {
		return street;
	}


	public void setStreet(Street street) {
		this.street = street;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public int getHouseNumber() {
		return houseNumber;
	}


	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}


	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", houseNumber=" + houseNumber + "]";
	}


	


	
	
}
