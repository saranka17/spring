package or.spring.sample.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import or.spring.sample.service.ShapeService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("spring-config.xml");
		ShapeService service=(ShapeService) context.getBean("service",ShapeService.class);
		//service.getCircle().setName("saravanan");
		System.out.println(service.getTriangle().getName());
		System.out.println(service.getCircle().getName());
		
	}

}
