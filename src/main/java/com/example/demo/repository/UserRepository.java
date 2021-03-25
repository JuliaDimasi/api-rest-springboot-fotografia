package com.example.demo.repository;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.demo.controller.User;




@Repository    
public class UserRepository {

	@Autowired
	@Qualifier("postgresDataSource") 
	DataSource dataSource;
	
	public class UserRowMapper implements RowMapper<User> {
		 
	    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
	    	User user = new User();
	    	user.setIdUser(rs.getLong("id_usuario"));
	    	user.setName(rs.getString("nombre"));
	    	user.setLastname(rs.getString("apellido"));
	    	user.setUrlImg(rs.getString("foto"));
	    	user.setAge(rs.getInt("edad"));
	        return user;
	    }
	}
	
	public List<User> findAllUsers() {
		
		JdbcTemplate conexion = new JdbcTemplate(dataSource);
		List<User> usuarios = conexion.query("select * from usuario", new UserRowMapper());
		
		return usuarios;
	}

}


