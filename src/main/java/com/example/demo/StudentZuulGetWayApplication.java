package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.example.zuulgatway.filters.*;

@SpringBootApplication
@EnableZuulProxy
public class StudentZuulGetWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentZuulGetWayApplication.class, args);
	}

	@Bean
	public PreFillter preFilter() {
		return new PreFillter();
	}

	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}

	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}

	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}
}
