package org.spring.sample.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.spring.sample.model.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
@Component
public class SpringDAOImpl {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate=new JdbcTemplate();
	public Actor getActor(int actor_id){
		Connection connection=null;
		Actor actor=null;
		try {
			connection=dataSource.getConnection();
			PreparedStatement ps= connection.prepareStatement("select * from actor where actor_id=?");
			ps.setInt(1, actor_id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				//actor=new Actor(rs.getInt("actor_id"),rs.getString("first_name"),rs.getString("last_name"));
			}
			rs.close();ps.close();
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
	public int getActorbyspring(int actor_id){
		String sql="select rental_id from payment where payment_id=5";
		//jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate.queryForInt(sql);
	}
	public Actor getActorNamebyspring(int actor_id){
		String sql="select * from actor where actor_id=?";
		//jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate.queryForObject(sql, new Object[]{actor_id}, new ActorMaper());
	}
	public List<Actor> getAllActors(){
		String sql="select * from actor order by first_name";
		//jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate.query(sql, new ActorMaper());
	}
	public DataSource getDataSource() {
		return dataSource;
	}
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate=new  JdbcTemplate(dataSource);
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	private static final class ActorMaper implements RowMapper<Actor>{

		public Actor mapRow(ResultSet rs, int rowNum) throws SQLException {
			Actor actor= new Actor();
			actor.setActor_id(rs.getInt("actor_id"));
			actor.setFirst_name(rs.getString("first_name"));
			actor.setLast_name(rs.getString("last_name"));
			return actor;
		}
		
	}
}
