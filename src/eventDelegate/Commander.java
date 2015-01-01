package eventDelegate;

import java.beans.EventHandler;
public class Commander implements Subject {
	private int targetPlaceID;

	//private event EventHandler  

	@Override
	public void sNotify() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getState() {
		// TODO Auto-generated method stub
		return this.targetPlaceID;
	}

	@Override
	public void setState(int state) {
		// TODO Auto-generated method stub
		this.targetPlaceID = state;
	}

}
