package decorator.withOutPattern;

public class Hunter2 extends Hunter1{
	@Override
	public void hunt(){
		super.hunt();
		this.trainDog();
		this.takePic();
	}
	
	//new function()
	public void trainDog(){
		System.out.println("Train the Dog!");
	}
	
	public void takePic(){
		System.out.println("Take a picture!");
	}
}
