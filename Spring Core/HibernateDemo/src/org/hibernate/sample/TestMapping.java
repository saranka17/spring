package org.hibernate.sample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.model.User;
import org.hibernate.model.Vehicle;

public class TestMapping {

	public static void main(String[] args) {
		User user= new User();
		user.setUsername("John");
		Vehicle vehicle=new Vehicle();
		vehicle.setVehicleName("CAR");
		//user.setVehicle(vehicle);
		Vehicle vehicle2= new Vehicle();
		vehicle2.setVehicleName("JEEP");
		user.getVehicle().add(vehicle);
		user.getVehicle().add(vehicle2);
		/*vehicle.setUser(user);
		vehicle2.setUser(user);*/
		/*vehicle.getUserList().add(user);
		vehicle2.getUserList().add(user);*/
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		session.persist(user);/*session.save(vehicle);session.save(vehicle2);*/
		session.getTransaction().commit();
		session.close();
		/*session=factory.openSession();
		user=null;vehicle=null;
		user=(User) session.get(User.class, 1);
		//System.out.println(user.getUsername()+"\n"+user.getVehicle().getVehicleName());
		session.close();*/
		factory.close();

	}

}
