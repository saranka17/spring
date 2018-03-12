package org.spring.sample.component;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext applicationContext= new ClassPathXmlApplicationContext("org/spring/sample/component/SpringConfig.xml");
		
		Circle circle= (Circle) applicationContext.getBean("circle");
		circle.draw();
		//circle.destroy();
		//System.out.println(applicationContext.getMessage("greeting", null, "default hello", null));
		
	}

}
