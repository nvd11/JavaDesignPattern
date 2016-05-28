package proxyPattern;

public class Wolf implements Molestable<Dog> {
	@Override
	public void molest(Dog o) {
		System.out.println("wolf laugh at the dog!");
		System.out.println("wolf ruffle the dog!");
	}
}
