package com.generic.startup;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//
//@Configuration
//@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {
// ne raboti!
//	@Override
//	public void addCorsMappings(CorsRegistry registry) {
//		registry.addMapping("/api/**")
//				.allowedOrigins("http://localhost")
//				.allowedMethods("GET", "POST","PUT", "DELETE");
//	}
}