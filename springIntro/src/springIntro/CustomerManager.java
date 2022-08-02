package springIntro;

public class CustomerManager implements ICustomerService {
	
	ICustomerDal customerDal;
	
	// Contructor injection
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	public void Add() {
		customerDal.Add();
	}
}
