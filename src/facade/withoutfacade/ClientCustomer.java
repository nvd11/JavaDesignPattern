package facade.withoutfacade;

public class ClientCustomer {
	public static void express(){
		int period = 3;
		int weight = 100;
		
		if (period < 5 & weight <= 100){
			new AirEx().aExpress();
		}
		//....
	}
}
