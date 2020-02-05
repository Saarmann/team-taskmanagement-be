package com.team.taskmanagement.web;

import com.team.taskmanagement.config.TeamTaskMngCoreConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(value = {TeamTaskMngCoreConfig.class})
public class TeamTaskManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeamTaskManagementApplication.class, args);
    }
}
