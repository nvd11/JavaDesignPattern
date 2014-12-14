package decorator.withOutPattern;

public class Client1 {
	public static void hunterHuntRabbit(){
		Hunter1 h = new Hunter1();
		h.hunt();
		
		Hunter2 h2 = new Hunter2();
		h2.hunt();
	}
	
	
}
