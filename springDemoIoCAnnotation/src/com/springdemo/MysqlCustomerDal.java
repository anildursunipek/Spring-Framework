package com.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class MysqlCustomerDal implements ICustomerDal {
	@Value("${database.connectionString}")
	String connectionString;
	
	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
	@Override
	public void Add() {
		System.out.println("Connection String: " + connectionString);
		System.out.println("Data added to MySql database.");
	}
	
}
