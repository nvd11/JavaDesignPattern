package builder.templateMethod;

public class ClientMakeCar {
	public static void f(){
		MakeCar mFort = new MakeFortCar();
		mFort.build();
		mFort.show();
		
		MakeCar mBenz = new MakeBenzCar();
		mBenz.build();
		mBenz.show();
	}
}
