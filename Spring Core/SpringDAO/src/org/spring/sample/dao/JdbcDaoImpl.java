package org.spring.sample.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.spring.sample.model.Actor;


public class JdbcDaoImpl {
	public Actor getActor(int actor_id){
		Connection connection=null;
		String driver="com.mysql.jdbc.Driver";
		Actor actor=null;
		try {
			Class.forName(driver).newInstance();
			connection=DriverManager.getConnection("jdbc:mysql://localhost/sakila","root","root");
			PreparedStatement ps= connection.prepareStatement("select * from actor where actor_id=?");
			ps.setInt(1, actor_id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				//actor=new Actor(rs.getInt("actor_id"),rs.getString("first_name"),rs.getString("last_name"));
			}
			rs.close();ps.close();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return actor;
	}
}
