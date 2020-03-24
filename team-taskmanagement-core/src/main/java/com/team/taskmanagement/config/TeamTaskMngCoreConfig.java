package com.team.taskmanagement.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScan({ "com.team.taskmanagement.service" } )
@EnableJpaRepositories(basePackages = "com.team.taskmanagement.dao")
@EntityScan( basePackages = {"com.team.taskmanagement.model"} )
@PropertySource("classpath:application.properties")
@EnableAutoConfiguration
public class TeamTaskMngCoreConfig {



}

