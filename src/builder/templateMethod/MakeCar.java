package builder.templateMethod;

import java.util.ArrayList;

public abstract class MakeCar {
	private ArrayList<String> partList = new ArrayList<String>();
	ArrayList<String> getPartList(){
		return this.partList;
	}
	
	abstract void buildEngine();
	abstract void buildBody();
	abstract void buildwheels();
	
	public void build(){
		this.buildEngine();
		this.buildBody();
		this.buildwheels();
	}
	
	public void show(){
		System.out.println(this.getClass().getSimpleName() + ": " + this.getPartList());
	}
}
