package com.demo.microservicedemo.salesorder.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan("com.demo.microservicedemo.salesorder")
@ImportResource("jpa.xml")
@EnableJpaRepositories
public class AppConfig {
}
