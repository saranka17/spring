package com.sample;

public class CurrentAccount implements Account {
	private String name="";
	public String getAccountType() {
		return "Current Account of "+name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}