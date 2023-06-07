package com.demo.pure.demosimple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DemoSimpleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSimpleApplication.class, args);
	}

}
