package factory.simple;

public class FactoryClient1 {
	public static void f(){
		String name = "Nokia";
		CellPhone p = CellPhoneFactory.createCellPhone(name);
		CellPhone p2 = CellPhoneFactory.createCellPhone(name);
		CellPhone p3 = CellPhoneFactory.createCellPhone(name);
		
		p.call();
		p2.sendEmail();
		p3.playMusic();
	}

}
