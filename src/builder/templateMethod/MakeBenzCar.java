package builder.templateMethod;

public class MakeBenzCar extends MakeCar{

	@Override
	void buildEngine() {
		// TODO Auto-generated method stub
		this.getPartList().add("Benz-Engine");
	}

	@Override
	void buildBody() {
		// TODO Auto-generated method stub
		this.getPartList().add("Benz-Body");
	}

	@Override
	void buildwheels() {
		// TODO Auto-generated method stub
		this.getPartList().add("Benz-wheels");
	}
	
}
