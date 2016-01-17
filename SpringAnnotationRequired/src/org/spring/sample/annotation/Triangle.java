package org.spring.sample.annotation;

public class Triangle implements Shape {
	private Point pointA;
	private Point pointB;
	private Point pointC;
	@Override
	public void draw() {
		System.out.println("Drawing Trianle:Point A:"+pointA.getX()+"-"+pointA.getY());
		System.out.println("Drawing Trianle:Point B:"+pointB.getX()+"-"+pointB.getY());
		System.out.println("Drawing Trianle:Point C:"+pointC.getX()+"-"+pointC.getY());
	}
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
}
