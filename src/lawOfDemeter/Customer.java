package lawOfDemeter;

import lawOfDemeter.service.*;
public class Customer {
	public void askHelp(){
		CustomerService.service(this);
	}
}
