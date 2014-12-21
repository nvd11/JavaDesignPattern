package proxyPattern;

public class Fox implements Hitable<Dog> {
	@Override
	public void hit(Dog g){
		this.sap(g);
		this.uppercut(g);
	}
	
	//闷棍
	private void sap(Dog g){
		System.out.println("give " + g.getName() + " a Sap!");
	}
	
	//上勾拳
	private void uppercut(Dog g){
		System.out.println("give " + g.getName() + " a Uppercute!");
	}
	
}
