package com.example.springJDBCDemo.repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;   

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.RowMapper;

import com.example.springJDBCDemo.model.Alien;
@Repository
public class AlienRepo {
	@Autowired
	JdbcTemplate template;
	
	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public void save(Alien alien) {
		String sql = "insert into alien(id,name,tech) values(?,?,?)";
		int row  = template.update(sql, alien.getId(),alien.getName(),alien.getTech());
		System.out.println(row);
	}
	
	public List<Alien> findAll(){
		String sql = "select * from alien";
		RowMapper<Alien> mapper = new RowMapper<Alien>() {
			
			@Override
			public Alien mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Alien a = new Alien();
				a.setId(rs.getInt("id"));
				a.setName(rs.getString("name"));
				a.setTech(rs.getString("tech"));
				return a;
			}
		};
		List<Alien> aliens = template.query(sql,mapper);
		return aliens;
		
	}
}
