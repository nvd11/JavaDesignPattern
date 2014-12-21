package factory;

public class Nokia implements CellPhone {
	@Override
	public void call(){
		System.out.println("calling by nokia");
	}

	@Override
	public void playMusic(){
		System.out.println("playing Music by nokia");
	}

	@Override
	public void sendEmail(){
		System.out.println("sending Email by nokia");
	}

}
