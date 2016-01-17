package or.spring.sample;

import org.spring.sample.dao.JdbcDaoImpl;
import org.spring.sample.model.Actor;

public class TestDao {

	public static void main(String[] args) {
		Actor actor= new JdbcDaoImpl().getActor(200);
		System.out.println(actor.getFirst_name()+" "+actor.getLast_name());
	}

}
