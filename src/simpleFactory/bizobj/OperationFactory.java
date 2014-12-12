package simpleFactory.bizobj;

public class OperationFactory {
	public static Operation getOperationObj(int i, int j, String symbol){
		switch(symbol){
		case "+": return new OperationAdd(i, j);
		case "-": return new OperationDel(i, j);
		}
		
		return null;
	}
}
