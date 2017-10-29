package com.datapeople.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="streets")
public class Street implements Serializable {
	
	/*@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)*/
	
	@Id
	@GenericGenerator(name="hilo-strategy", strategy = "hilo")
	@GeneratedValue(generator = "hilo-strategy")
	
	@Column(name="id")
	private  long id;
	
	@Column(name="name_str")
	private String nameStr;
	
	@OneToOne(mappedBy="street")
	private  Address address;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNameStr() {
		return nameStr;
	}
	public void setNameStr(String nameStr) {
		this.nameStr = nameStr;
	}
	
	@Override
	public String toString() {
		return "Street [id=" + id + ", nameStr=" + nameStr + "]";
	}
}
