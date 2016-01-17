package org.hibernate.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;
@Embeddable
public class LoginName implements Serializable {
	private int empl_id;
	private Date dob;
	public int getEmpl_id() {
		return empl_id;
	}
	public void setEmpl_id(int empl_id) {
		this.empl_id = empl_id;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}

}
