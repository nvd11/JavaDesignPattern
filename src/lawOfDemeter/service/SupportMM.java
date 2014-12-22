package lawOfDemeter.service;

import lawOfDemeter.Customer;

public class SupportMM {
	private String name;
	protected SupportMM(String name){
		this.name = name;
	}
	protected void service(Customer c){
		System.out.println("Hello i am " + this.name);
	}
}
