package com.datapeople.bean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;



@Entity
@Table(name="human")
public class Human {
	
	private static final SimpleDateFormat FORMATTER = new SimpleDateFormat("yyyy.MM.dd");
	
	/*@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)*/
	
	@Id
	@GenericGenerator(name="hilo-strategy", strategy = "hilo")
	@GeneratedValue(generator = "hilo-strategy")

	@Column(name="id")
	private long id;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="middle_name")
	private String middleName;
	
	@Column(name="sex")
	private String sex;
	
	@Column(name="birth_date")
	private Date birthDate = new Date();
	
	@OneToOne
	@JoinColumn(name="adress_id")
	private Address adress;
	
	
	public String getDateStr() {
		return FORMATTER.format(birthDate);
	}

	public void setDateStr(String dateStr) throws ParseException {
		birthDate = FORMATTER.parse(dateStr);
	}
	
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
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
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
	public Address getAdress() {
		return adress;
	}
	public void setAdress(Address adress) {
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "Human [id=" + id + ", lastName=" + lastName + ", firstName=" + firstName + ", middleName=" + middleName + ", sex="
				+ sex + ", birthDate=" + birthDate + ", adress=" + adress + "]";
	}
	
	
	
}
