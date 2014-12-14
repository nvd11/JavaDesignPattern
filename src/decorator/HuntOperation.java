package decorator;

public abstract class HuntOperation extends Hunter{
	
	private Hunter hunter = null;
	
	//setting component
	public HuntOperation(Hunter hunter){
		this.hunter = hunter;
	}
	
	//actually execute component's hunt() method
	@Override
	public void hunt(){
		if (null != hunter){
			hunter.hunt();
		}
	}
}
