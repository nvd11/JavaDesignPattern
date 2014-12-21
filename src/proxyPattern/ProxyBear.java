package proxyPattern;

public class ProxyBear implements Hitable<Dog>{
	private Fox f = null;
	public ProxyBear(){
		if (null == f){
			f = new Fox();
		}
	}
	
	@Override
	public void hit(Dog g){
		if (null != f){
			f.hit(g);
		}
	}
	
}
