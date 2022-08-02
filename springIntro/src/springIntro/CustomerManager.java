package springIntro;

public class CustomerManager implements ICustomerService {
	
	ICustomerDal customerDal;
	
	// Constructor injection
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	public void Add() {
		customerDal.Add();
	}
}
