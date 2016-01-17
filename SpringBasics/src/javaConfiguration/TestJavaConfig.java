package javaConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestJavaConfig {

	public static void main(String[] args) {
		System.out.println("Been not yet initialized..");
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(MessageBeanConfig.class);
		MessageBean mBean=(MessageBean) context.getBean(MessageBean.class);
		System.out.println("Bean Message===="+mBean.getMessage());
/*		mBean.destroy();
	System.out.println("called bean destroyed");*/	
		context.close();

	}

}
