package or.spring.sample;

import java.util.List;

import org.spring.sample.dao.SpringDAOImpl;
import org.spring.sample.dao.SpringHibernateDAOImpl;
import org.spring.sample.model.Actor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HibernateDAOTest {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		SpringHibernateDAOImpl dao= context.getBean("springHibernateDAOImpl",SpringHibernateDAOImpl.class);
		System.out.println(dao.getActorbyspring());
	}

}
