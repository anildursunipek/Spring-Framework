package springIntro;

public class OracleCustomerDal implements ICustomerDal {
	
	@Override
	public void Add() {
		System.out.println("Data added to oracle database.");
	}
}
