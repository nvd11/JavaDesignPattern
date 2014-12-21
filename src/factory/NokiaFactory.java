package factory;

public class NokiaFactory extends CellPhoneFactory{
	@Override
	public CellPhone createCellPhone(){
		return new Nokia();
	}
}
