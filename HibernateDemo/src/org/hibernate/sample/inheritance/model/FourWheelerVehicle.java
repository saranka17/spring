package org.hibernate.sample.inheritance.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


public class FourWheelerVehicle extends Vehicle{
	private String steeringWheel;

	public String getSteeringWheel() {
		return steeringWheel;
	}

	public void setSteeringWheel(String steeringWheel) {
		this.steeringWheel = steeringWheel;
	}

	
}
