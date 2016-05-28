package proxyPattern;

public class ProxyBear implements Hitable<Dog>{
	private Hitable<Dog> f = null;
	public ProxyBear(){
		if (null == f){
			f = new Fox();
		}
	}
	
	@Override
	public void hit(Dog g){
		if (null != f){
			System.out.println("Bear hit InterDogChicke!");
			f.hit(g);
			System.out.println("Bear bite InterDogChicke!");
		}
	}
}
