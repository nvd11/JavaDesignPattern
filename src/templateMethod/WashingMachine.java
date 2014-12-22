package templateMethod;

public abstract class WashingMachine {
	public abstract void inflow();
	public abstract void cleaning();
	public abstract void drying();
	
	public void washing(){
		this.inflow();
		this.cleaning();
		this.drying();
	}
}
