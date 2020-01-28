package com.team.taskmanagement.config;


import com.team.taskmanagement.dao.helpers.CustomerRowMapper;
import com.team.taskmanagement.dao.helpers.TaskRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.team.taskmanagement.dao")
@PropertySource("classpath:database.properties") // get datasource properties
public class TeamTaskMngCoreConfig {

	private final String URL = "url";
	private final String USER = "dbuser";
	private final String DRIVER = "driver";
	private final String PASSWORD = "dbpassword";
	
	@Autowired
	private Environment env;
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setUrl(env.getProperty(URL));
		driverManagerDataSource.setUsername(env.getProperty(USER));
		driverManagerDataSource.setPassword(env.getProperty(PASSWORD));
		driverManagerDataSource.setDriverClassName(env.getProperty(DRIVER));
		return driverManagerDataSource;
	}

	@Bean
	public CustomerRowMapper customerRowMapper(){
	    return new CustomerRowMapper();
    }

    @Bean
	public TaskRowMapper taskRowMapper(){
		return new TaskRowMapper();
	}

	@Bean
	public JdbcTemplate jdbcTemplate(DataSource datasource){
		return new JdbcTemplate(datasource);
	}
	
//	@Bean
//	public NamedParameterJdbcTemplate namedParameterJdbcTemplate(DataSource datasource){
//		return new NamedParameterJdbcTemplate(datasource);
//	}

}
