package strategy.bizobj;

public class OperationContext {
	private Operation oper;
	
	public OperationContext(Operation oper){
		this.oper = oper;
	}
	
	//Simple Factory 
	public OperationContext(String symbol){
		switch(symbol){
		case "+": this.oper = new OperationAdd();
		case "-": this.oper = new OperationDel();
		}
	}
	
	public int compute(int i, int j){
		oper.setI(i);
		oper.setJ(j); 
		return oper.getResult();
	}
}
