package com.heybugs.nodrah;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class NodrahApplication {
	@Bean
	public ModelMapper modelMapper (){
		return new ModelMapper();
	}
	public static void main(String[] args) {
		SpringApplication.run(NodrahApplication.class, args);
	}

}
