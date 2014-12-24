package builder;

public abstract class CarBuilder {
	private CarProduct prod = new CarProduct();
	
	CarProduct getProd() {
		return prod;
	}
	
	void setProd(CarProduct prod) {
		this.prod = prod;
	}
	
	abstract void setBrand();
	abstract void buildEngine();
	abstract void buildBody();
	abstract void buildWheels();
}
