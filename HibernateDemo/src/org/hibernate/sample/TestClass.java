package org.hibernate.sample;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.model.Address;
import org.hibernate.model.Employee;
import org.hibernate.model.LoginName;

public class TestClass {

	public static void main(String[] args) {
		Employee employee= new Employee();
		employee.setFirstName("John");
		employee.setLastName("Peter33");
		employee.setJoinedDate(new Date());
/*		Employee employee1= new Employee();
		employee1.setFirstName("John");
		employee1.setJoinedDate(new Date());*/
		employee.setDescription("testsetsetsetsdfsdfsdfsdf54s6d54f65s4df56sdf65sdfs21d321fsd2f");
		Address address=new Address();
		address.setCity("Chennai");
		address.setState("TN");
		address.setZip("111111");
		Address address1=new Address();
		address1.setCity("Chennai1");
		address1.setState("TNdas");
		address1.setZip("111111asdas");
		//employee.setAddress(address);
		//employee.setHomeAddress(address);
		employee.getListOfAddress().add(address);
		employee.getListOfAddress().add(address1);
		LoginName loginName= new LoginName();
		loginName.setEmpl_id(1);
		loginName.setDob(new Date());
		//employee.setEmpId(loginName);
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(employee);
		//session.save(employee1);
		session.getTransaction().commit();
		session.close();
		
		session=sessionFactory.openSession();
		Employee employee2=(Employee) session.get(Employee.class, 1);
		System.out.println(employee2.getFirstName());
		System.out.println(employee2.getListOfAddress().size());
		session.close();
	/*	employee=null;
		session=sessionFactory.openSession();
		session.beginTransaction();
		employee=(Employee) session.get(Employee.class, 1);
		System.out.println(employee.getFirstName());
		session.close();*/
	}

}
