package or.spring.sample.model;

import or.spring.sample.aspect.Loggable;

public class Circle {
	private String name;
	
	@Loggable
	public String getName() {
		System.out.println("Circle get called");
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
}
