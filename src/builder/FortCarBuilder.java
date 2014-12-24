package builder;

public class FortCarBuilder extends CarBuilder {

	@Override
	void setBrand() {
		// TODO Auto-generated method stub
		this.getProd().setbrand("Fort");
	}

	@Override
	void buildEngine() {
		// TODO Auto-generated method stub
		this.getProd().addPart("Fort-Engine");
	}

	@Override
	void buildBody() {
		// TODO Auto-generated method stub
		this.getProd().addPart("Fort-Body");
	}

	@Override
	void buildWheels() {
		// TODO Auto-generated method stub
		this.getProd().addPart("Fort-Wheels");
	}

}
