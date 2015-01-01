package observer;

public interface Subject {
	public void attach(Observer obs);
	public void detach(Observer obs);
	public void sNotify();   //notify is a finel method of Object class
	public int  getState();
	public void setState(int state);
}
