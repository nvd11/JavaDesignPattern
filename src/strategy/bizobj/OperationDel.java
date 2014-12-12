package strategy.bizobj;

public class OperationDel extends Operation{
	
	@Override
	public int getResult(){
		return this.getI() - this.getJ();
	}
}
