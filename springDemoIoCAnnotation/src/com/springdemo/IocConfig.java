package com.springdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration 
@ComponentScan("com.springdemo") // Annotation ile new'lenmesi istedigimiz sinifi beliritiyoruz ve spring o sinifi annotation ile belirliyip new'leme islemi yapiyor
public class IocConfig {
}
