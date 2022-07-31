package springIntro;

public class MysqlCustomerDal implements ICustomerDal {

	@Override
	public void Add() {
		System.out.println("Data added to MySql database.");
	}
	
}
