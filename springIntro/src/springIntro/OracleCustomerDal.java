package springIntro;

public class OracleCustomerDal implements ICustomerDal {
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
		System.out.println("Data added to oracle database.");
	}
}
