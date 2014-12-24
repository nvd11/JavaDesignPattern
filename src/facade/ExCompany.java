package facade;

public class ExCompany {
	public void Express(int period, int weight){
		if (weight <= 100 && period <= 3){
			new AirEx().aExpress();
			return;
		}
		
		if (weight <= 1000){
			new TrainEx().tExpress();
			return;
		}
		
		new ShipEx().sExpress();
	}
}
