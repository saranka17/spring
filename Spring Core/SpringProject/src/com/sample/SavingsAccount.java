package com.sample;

public class SavingsAccount implements Account {
	private String name="";
	public String getAccountType() {
		return "Saving Account of "+name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
