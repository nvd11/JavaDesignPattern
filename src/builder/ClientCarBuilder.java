package builder;

public class ClientCarBuilder {
	public static void f(){
		CarProduct prod;
		CarDirector cd = new CarDirector();
		
		CarBuilder cb = new FortCarBuilder();
		cd.construct(cb);
		prod = cb.getProd();
		prod.show();
		
		cb = new BenzCarBuilder();
		cd.construct(cb);
		prod = cb.getProd();
		prod.show();
	}
}
