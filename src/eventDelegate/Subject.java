package eventDelegate;

public interface Subject {
	public void sNotify();   //notify is a finel method of Object class
	public int  getState();
	public void setState(int state);
}
