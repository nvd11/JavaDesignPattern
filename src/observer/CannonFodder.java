package observer;

public class CannonFodder implements Observer{
	private int id;
	public CannonFodder(int id){
		this.id = id;
	}
	
	public void getDown(){
		System.out.println(this.getClass().getSimpleName() +" id:"
				+ this.id + " getDowned");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		this.getDown();
	}
}
