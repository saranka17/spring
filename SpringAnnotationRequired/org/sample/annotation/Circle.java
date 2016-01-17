package org.spring.sample.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape {
	@Autowired
	@Qualifier("circleRelated")
	private Point cneter;
	@Resource(name="pointC")
	private Point centerB;
	@Override
	public void draw() {
		System.out.println("Drawng Circle:("+cneter.getX()+":"+cneter.getY()+")");
		System.out.println("Drawng Circle:("+centerB.getX()+":"+centerB.getY()+")");
	}
	public Point getCneter() {
		return cneter;
	}
	
	public void setCneter(Point cneter) {
		this.cneter = cneter;
	}
	@PostConstruct
	public void initCircle(){
		System.out.println("Intialize the Circle...");
	}
	@PreDestroy
	public void destroyCircle(){
		System.out.println("Destroy the Circle...");
	}
	
}
