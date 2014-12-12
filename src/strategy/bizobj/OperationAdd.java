package strategy.bizobj;

public class OperationAdd extends Operation{
	
	@Override
	public int getResult(){
		return this.getI() + this.getJ();
	}
}
