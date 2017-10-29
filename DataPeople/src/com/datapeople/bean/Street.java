package com.datapeople.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="streets")
public class Street {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private  long id;
	
	@Column(name="name_str")
	private String nameStr;
	
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
