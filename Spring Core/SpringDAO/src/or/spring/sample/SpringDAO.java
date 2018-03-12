package or.spring.sample;

import java.util.List;

import org.spring.sample.dao.SpringDAOImpl;
import org.spring.sample.model.Actor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDAO {
	
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		SpringDAOImpl dao= context.getBean("springDAOImpl",SpringDAOImpl.class);
		//Actor actor=dao.getActor(1);
		//System.out.println(actor.getFirst_name()+" "+actor.getLast_name());
		System.out.println(dao.getActorbyspring(10));
		//System.out.println(dao.getActorNamebyspring(10));
		Actor actor=dao.getActorNamebyspring(10);
		System.out.println(actor.getFirst_name()+" "+actor.getLast_name());
		List<Actor> actorList=dao.getAllActors();
		for (Actor actor2 : actorList) {
			System.out.println("Id:"+actor2.getActor_id()+"="+actor2.getFirst_name()+","+actor2.getLast_name());
		}
		
	}

}
