package decorator;

public class HuntTakePic extends HuntOperation{
	public HuntTakePic(Hunter hunter) {
		super(hunter);
	}

	@Override
	public void hunt(){
		super.hunt();
		this.takePic();
	}
	
	public void takePic(){
		System.out.println("Taking a Picture!");
	}
}
