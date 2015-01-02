package callBack;

public class SFExpress implements Callbackable{

	public void SFSendGoods(){
		System.out.println("Sent goods by SF!");
	}
	
	@Override
	public void method() {
		// TODO Auto-generated method stub
		this.SFSendGoods();
	}
	
}
