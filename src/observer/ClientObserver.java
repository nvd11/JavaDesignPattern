package observer;

public class ClientObserver {
	public static void f(){
		Commander cmder = new Commander();
		CannonShooter cster = new CannonShooter(cmder);
		
		CannonFodder cfder1 = new CannonFodder(1);
		CannonFodder cfder2 = new CannonFodder(2);
		CannonFodder cfder3 = new CannonFodder(3);
		
		cmder.setState(107);
		cmder.attach(cster);
		cmder.attach(cfder1);
		cmder.attach(cfder2);
		cmder.attach(cfder3);

		cmder.sNotify();
		
		cmder.setState(108);
		cmder.detach(cfder3);
		
		cmder.sNotify();
		
	}
}
