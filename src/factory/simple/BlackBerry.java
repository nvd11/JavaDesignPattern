package factory.simple;

public class BlackBerry implements CellPhone {
	@Override
	public void call(){
		System.out.println("calling by BlackBerry");
	}

	@Override
	public void playMusic(){
		System.out.println("playing Music by BlackBerry");
	}

	@Override
	public void sendEmail(){
		System.out.println("sending Email by BlackBerry");
	}

}
