package simpleFactory.bizobj;

public class Operation1 {
	private int i;
	private int j;
	
	public Operation1(int i, int j){
		this.i = i;
		this.j = j;
	}
	
	private int add(){
		return i + j;
	}
	
	private int del(){
		return i - j;
	}
	
	public int getResult(String symbol){
		switch(symbol){
			case "+": return add();
			case "-": return del();
		}
		
		return 0;
	}
}
