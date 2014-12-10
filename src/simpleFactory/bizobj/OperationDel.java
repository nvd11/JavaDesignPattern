package simpleFactory.bizobj;

public class OperationDel extends Operation{
	public OperationDel(int i, int j) {
		super(i, j);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int getResult(){
		return this.getI() - this.getJ();
	}
}
