package factory.simple;

public class FactoryClient11 {
	public static void f(){
		CellPhone p = CellPhoneReflectFactory.createCellPhone("BlackBerry");
		p.call();
	}
}
