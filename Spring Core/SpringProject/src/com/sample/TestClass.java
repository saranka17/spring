package com.sample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestClass {

	public static void main(String[] args) {
		   XmlBeanFactory factory = new XmlBeanFactory
                   (new ClassPathResource("spring-beans.xml"));
		Account sa=(Account) factory.getBean("savingAccount");
		Account ca=(Account) factory.getBean("currentAccount");
		System.out.println(sa.getAccountType());
		System.out.println(ca.getAccountType());
	}

}
