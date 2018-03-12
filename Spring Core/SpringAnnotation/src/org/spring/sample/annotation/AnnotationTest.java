package org.spring.sample.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {

	public static void main(String[] args) {
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("spring-anno.xml");
		context.registerShutdownHook();
		Circle circle= (Circle) context.getBean("circleBean");
		circle.draw();
		//Triangle triangle=(Triangle)context.getBean("trianleBean");
		//triangle.draw();
	}

}
