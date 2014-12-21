package prototype;

public class ClientProtoType {
	public static void f(){
		Prod p1 = new Prod();
		p1.setProdID(2);
		p1.setProdName("knife");
		
		Order od1 = new Order();
		od1.setOrderID(2);
		od1.setAmount(30);
		od1.setProd(p1);
		
		Order od2 = (Order)od1.clone();
		System.out.println(od1);
		System.out.println(od2);
		
		od1.setOrderID(3);
		od1.setAmount(40);
		od1.getProd().setProdName("blade");
		
		System.out.println(od1);
		System.out.println(od2);
	}
}
