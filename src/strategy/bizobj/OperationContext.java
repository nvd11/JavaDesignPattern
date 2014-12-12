package strategy.bizobj;

public class OperationContext {
	private Operation oper;
	
	public OperationContext(Operation oper){
		this.oper = oper;
	}
	
	public int compute(int i, int j){
		oper.setI(i);
		oper.setJ(j); 
		return oper.getResult();
	}
}
