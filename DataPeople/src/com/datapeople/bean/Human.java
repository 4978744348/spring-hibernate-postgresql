package com.datapeople.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="human")
public class Human {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="name")
	private String name;
	
	@Column(name="middle_name")
	private String middleName;
	
	@Column(name="sex")
	private String sex;
	
	@Column(name="birth_date")
	private Date birthDate;
	
	// ?????????????????
	private long adresssId;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public long getAdresssId() {
		return adresssId;
	}
	public void setAdresssId(long adresssId) {
		this.adresssId = adresssId;
	}
	@Override
	public String toString() {
		return "Human [id=" + id + ", lastName=" + lastName + ", name=" + name + ", middleName=" + middleName + ", sex="
				+ sex + ", birthDate=" + birthDate + ", adresssId=" + adresssId + "]";
	}
	
}
