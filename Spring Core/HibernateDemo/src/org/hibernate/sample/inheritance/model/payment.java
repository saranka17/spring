package org.hibernate.sample.inheritance.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class payment {
	@Id
	private int payment_id;
	private String name;
	private String last_update;
	public int getPayment_id() {
		return payment_id;
	}
	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLast_update() {
		return last_update;
	}
	public void setLast_update(String last_update) {
		this.last_update = last_update;
	}
	
}
