package factory;

public class FactoryClient2 {
	public static void f(){
		CellPhoneFactory factory = new NokiaFactory();
		CellPhone p = factory.createCellPhone();
		CellPhone p2 = factory.createCellPhone();
		CellPhone p3 = factory.createCellPhone();
		
		p.call();
		p2.sendEmail();
		p3.playMusic();
	}
}
