package simpleFactory.bizobj;

public abstract class Operation {
	private int i;
	private int j;
	
	public int getI(){
		return i;
	}
	
	public int getJ(){
		return j;
	}
	
	public Operation(int i, int j){
		this.i = i;
		this.j = j;
	}
	
	public abstract int getResult();
}
