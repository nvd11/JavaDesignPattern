package facade;

public class ClientCustomer {
	public static void express(){
		int period = 5;
		int weight = 100;

		new ExCompany().Express(period, weight);
	}
}
