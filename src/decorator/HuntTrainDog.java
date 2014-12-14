package decorator;

public class HuntTrainDog extends HuntOperation{

	public HuntTrainDog(Hunter hunter) {
		super(hunter);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void hunt(){
		super.hunt();
		this.trainDog();
	}
	
	public void trainDog(){
		System.out.println("Training the dog!");
	}

}
