package strategy.bizobj;

public abstract class Operation {
	private int i;
	private int j;
	
	public int getI(){
		return i;
	}
	
	public void setI(int i){
		this.i = i;
	}
	
	public void setJ(int j){
		this.j = j;
	}
	
	public int getJ(){
		return j;
	}
	
	public abstract int getResult();
}
