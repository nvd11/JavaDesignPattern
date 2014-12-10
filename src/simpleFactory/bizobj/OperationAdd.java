package simpleFactory.bizobj;

public class OperationAdd extends Operation{
	public OperationAdd(int i, int j) {
		super(i, j);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int getResult(){
		return this.getI() + this.getJ();
	}
}
