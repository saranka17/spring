package org.hibernate.sample.inheritance.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


public class TwoWheelerVehicle extends Vehicle{
	private String steeringHandle;

	public String getSteeringHandle() {
		return steeringHandle;
	}

	public void setSteeringHandle(String steeringHandle) {
		this.steeringHandle = steeringHandle;
	}
	
}
