package com.knits.tms.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.knits.tms.config.TmsCoreContext;


@SpringBootApplication
@Import(value = {TmsCoreContext.class})
public class TmsApplication {

	public static void main(String[] args) {
		 SpringApplication.run(TmsApplication.class, args);
	}

}
