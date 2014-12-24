package builder;

public class CarDirector {
	public void construct(CarBuilder cb){
		cb.setBrand();
		cb.buildEngine();
		cb.buildBody();
		cb.buildWheels();
	}
}
