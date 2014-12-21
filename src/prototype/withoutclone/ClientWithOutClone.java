package prototype.withoutclone;

public class ClientWithOutClone {
	public static void f(){
		f1();
	}
	
	private static void f1(){
		Prod p1 = new Prod();
		p1.setProdID(1);
		p1.setProdName("Hammer");
		
		Order od1 = new Order();
		od1.setOrderID(1);
		od1.setProd(p1);
		od1.setAmount(20);
		
		Prod p2 = new Prod();
		p2.setProdID(1);
		p2.setProdName("Hammer");
		
		Order od2 = new Order();
		od2.setOrderID(1);
		od2.setProd(p1);
		od2.setAmount(20);
		
		System.out.println(od1);
		System.out.println(od2);
	}
}
