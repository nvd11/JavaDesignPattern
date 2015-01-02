package callBack;

public class EMS implements Callbackable {
	public void EMSSendGoods(){
		System.out.println("Sent GOods by EMS");
	}
	
	@Override
	public void method() {
		// TODO Auto-generated method stub
		this.EMSSendGoods();
	}
	
}
