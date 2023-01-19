package com.simulator.fed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@EnableSwagger2
public class Simulator {

	public static void main(String[] args) {
		
		SpringApplication.run(Simulator.class, args) ;
	}

}
