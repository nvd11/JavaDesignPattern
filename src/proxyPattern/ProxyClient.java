package proxyPattern;

public class ProxyClient {
	public static void f(){
		Dog g = new Dog("InterDogChicken");
		ProxyBear b = new ProxyBear();
		
		b.hit(g);
	}
}
