package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// Bu asamada xml dosyasini projeceden cikararak artik annotation bazli calisarak islemleri bir sinif uzerinden devam ettiriyoruz
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(IocConfig.class);
		ICustomerDal customerDal = context.getBean("database",ICustomerDal.class);
		customerDal.Add();
	}
}
