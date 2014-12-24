package builder;

import java.util.ArrayList;
public class CarProduct {
	private ArrayList<String> partList = new ArrayList<String>();
	private String brandName;
	
	void addPart(String part){
		this.partList.add(part);
	}
	
	void setbrand(String name){
		this.brandName = name;
	}
	
	public void show(){
		System.out.println(this.brandName + ":" + partList);
	}
}
