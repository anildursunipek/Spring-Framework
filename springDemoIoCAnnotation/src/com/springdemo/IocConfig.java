package com.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration 
@ComponentScan("com.springdemo") //Annotation ile new'lenmesi istedigimiz sinifi beliritiyoruz ve spring o sinifi annotation ile belirliyip new'leme islemi yapiyor
@PropertySource("classpath:values.properties")
public class IocConfig {
	@Bean
	public ICustomerDal database() {
		return new MysqlCustomerDal();
	}
	@Bean
	public ICustomerService service() {
		return new CustomerManager(database());
	}
}
