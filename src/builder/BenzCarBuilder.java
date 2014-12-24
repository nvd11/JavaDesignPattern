package builder;

public class BenzCarBuilder extends CarBuilder {

	@Override
	void setBrand() {
		// TODO Auto-generated method stub
		this.getProd().setbrand("Benz");
	}

	@Override
	void buildEngine() {
		// TODO Auto-generated method stub
		this.getProd().addPart("Benz-Engine");
	}

	@Override
	void buildBody() {
		// TODO Auto-generated method stub
		this.getProd().addPart("Benz-Body");
	}

	@Override
	void buildWheels() {
		// TODO Auto-generated method stub
		this.getProd().addPart("Benz-Wheels");
	}

}
