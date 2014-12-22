package lawOfDemeter;


public class ClientDemeter {
	public static void f(){
		Customer c = new Customer();
		c.askHelp();
	}
}
