package com.datapeople.bean;

public class StreetDirectory {
	
	private  long id;
	private int code;
	private String nameStrDirecotiry;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getNameStrDirecotiry() {
		return nameStrDirecotiry;
	}
	public void setNameStrDirecotiry(String nameStrDirecotiry) {
		this.nameStrDirecotiry = nameStrDirecotiry;
	}
	@Override
	public String toString() {
		return "StreetDirectory [id=" + id + ", code=" + code + ", nameStrDirecotiry=" + nameStrDirecotiry + "]";
	}
	
}
