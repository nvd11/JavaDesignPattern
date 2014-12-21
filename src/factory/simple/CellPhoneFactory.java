package factory.simple;

public class CellPhoneFactory {
	public static CellPhone createCellPhone(String name){
		CellPhone p = null;
		switch(name){
		case "Nokia" : 
			p = new Nokia(); 
			break;
		case "BlackBerry" : 
			p = new BlackBerry(); 
			break;
		}
		
		return p;
	}
}
