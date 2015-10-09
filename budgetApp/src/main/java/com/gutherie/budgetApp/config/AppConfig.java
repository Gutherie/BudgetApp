package com.gutherie.budgetApp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.context.annotation.ComponentScan;

@Configuration
@EnableWebMvc
@ComponentScan (basePackages = {"com.springcookbook.controller"})
public class AppConfig {

}
