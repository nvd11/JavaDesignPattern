package decorator;

public class Hunter implements Huntable {
	public void eat(){
		System.out.println("eating!");
	}

	@Override
	public void hunt(){
		System.out.println("Hunter is Hunting!");
	}
}
