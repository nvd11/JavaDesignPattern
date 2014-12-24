package builder.templateMethod;

public class MakeFortCar extends MakeCar{

	@Override
	void buildEngine() {
		// TODO Auto-generated method stub
		this.getPartList().add("Fort-Engine");
	}

	@Override
	void buildBody() {
		// TODO Auto-generated method stub
		this.getPartList().add("Fort-Body");
	}

	@Override
	void buildwheels() {
		// TODO Auto-generated method stub
		this.getPartList().add("Fort-wheels");
	}
	
}
