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

import com.example.demo.controller.photo;
import com.example.demo.repository.photoRepository.photoRowMapper;

@Repository
public class photoRepository {

	@Autowired
	@Qualifier("postgresDataSource") 
	DataSource dataSource;
	
	public class photoRowMapper implements RowMapper<photo> {
		 
	    public photo mapRow(ResultSet rs, int rowNum) throws SQLException {
	    	photo photo = new photo();
	    	photo.setIdPhoto(rs.getLong("id_photo"));
	    	photo.setSection(rs.getString("section"));
	    	photo.setPathImg(rs.getString("ruta_imagen"));
	    	photo.setDescription(rs.getString("description"));
	        return photo;
	    }
	}
	
	public List<photo> findAllPhotos() {
		
		JdbcTemplate conexion = new JdbcTemplate(dataSource);
		List<photo> photos = conexion.query("select * from photo", new photoRowMapper());
		
		return photos;
	}
}

