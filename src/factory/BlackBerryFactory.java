package factory;

public class BlackBerryFactory extends CellPhoneFactory{
	@Override
	public CellPhone createCellPhone(){
		return new BlackBerry();
	}
}
