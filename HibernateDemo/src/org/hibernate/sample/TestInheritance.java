package org.hibernate.sample;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.sample.inheritance.model.Actor;
import org.hibernate.sample.inheritance.model.FourWheelerVehicle;
import org.hibernate.sample.inheritance.model.TwoWheelerVehicle;
import org.hibernate.sample.inheritance.model.Vehicle;

public class TestInheritance {

	public static void main(String[] args) {
		/*Vehicle vehicle= new Vehicle();
		vehicle.setVehicleName("CAR");*/
		/*TwoWheelerVehicle twoWheelerVehicle= new TwoWheelerVehicle();
		twoWheelerVehicle.setVehicleName("Hero");
		twoWheelerVehicle.setSteeringHandle("Bike Stereing Handle");
		
		FourWheelerVehicle fourWheelerVehicle= new FourWheelerVehicle();
		fourWheelerVehicle.setVehicleName("Porshe");
		fourWheelerVehicle.setSteeringWheel("Steering!!");*/
		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		
		/*Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(vehicle);
		vehicle.setVehicleName("testtttt");
		session.save(twoWheelerVehicle);
		session.save(fourWheelerVehicle);
		session.getTransaction().commit();
		session.close();
		 session=sessionFactory.openSession();
		 Query query=session.createQuery("from Vehicle where vehicleId=1");
		 List vehiclelist=query.list();
		 System.out.println(vehiclelist.size());
		sessionFactory.close();*/
		
		Session session= sessionFactory.openSession();
		//Query query=session.createQuery("from Actor where actor_id>? and actor_id<:userid");
		Query query=session.getNamedQuery("Actor.ById");
		query.setInteger(0, 190);
		query.setCacheable(true);
		//query.setInteger("userid", 161);
		session.beginTransaction();
		List<Actor> actors=(List<Actor>)query.list();
		for (Actor actor : actors) {
			System.out.println(actor.getActor_id()+"======"+actor.getFirst_name());
		}
		actors=(List<Actor>)query.list();
		System.out.println(actors.size());
		Query query2=session.getNamedQuery("Actor.ById");
		query2.setInteger(0, 190);
		query2.setCacheable(true);
		actors=(List<Actor>)query2.list();
		System.out.println(actors.size());
		Actor actor= (Actor) session.get(Actor.class, 1);
		//actor.setFirst_name("Ram");
		System.out.println(actor.getFirst_name());
		session.close();
		Session session2= sessionFactory.openSession();
		
		Actor actor2= (Actor) session2.get(Actor.class, 1);
		
		System.out.println(actor2.getFirst_name());
		session2.close();sessionFactory.close();

	}

}
