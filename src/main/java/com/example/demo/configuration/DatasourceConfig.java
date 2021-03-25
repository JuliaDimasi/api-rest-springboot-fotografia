package com.example.demo.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
@Configuration
public class DatasourceConfig {
	
	
@Value("${spring.datasource.driverClassName}")
String driverClassName;

@Value("${spring.datasource.url}")
String url;

@Value("${spring.datasource.username}")
String username;

@Value("${spring.datasource.password}")
String password;



	
@Bean(name = "postgresDataSource")
public DataSource dataSource() {
    DriverManagerDataSource dataSource = new DriverManagerDataSource();

    dataSource.setDriverClassName(driverClassName);
    dataSource.setUsername(username);
    dataSource.setPassword(password);
    dataSource.setUrl(url); 
    
    return dataSource;
}

}
