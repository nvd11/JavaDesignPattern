package templateMethod;

public class ClientTemplateMethod {
	public static void f(){
		WashingMachine wm = new Siemens();
		wm.washing();
		
		wm = new Panasonic();
		wm.washing();
		
	}

}
