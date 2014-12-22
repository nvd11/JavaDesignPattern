package lawOfDemeter.service;

import lawOfDemeter.Customer;

public class CustomerService {
	public static void service(Customer c){
		getFreeSupport().service(c);
	}
	
	private static SupportMM getFreeSupport(){
		return new SupportMM("Inne"); // just a sample
	}
}
