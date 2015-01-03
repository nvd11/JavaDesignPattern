package eventDelegate.test;

public class ClientSAB {
	public static void f(){
		S s = new S();
		s.attach(new A(), "a");
		s.attach(new A(), "a");
	
		B b1 = new B();
		s.attach(b1, "b");
		s.sNotify();
		
		System.out.println("Step 2!");
		s.detach(b1,"b");
		s.sNotify();
	
	}
}
