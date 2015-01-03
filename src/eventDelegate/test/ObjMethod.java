package eventDelegate.test;

public class ObjMethod {
	private Object obj;
	private String method;
	
	public ObjMethod(Object obj, String method){
		this.obj = obj;
		this.method = method;
	}

	public String getMethod() {
		return this.method;
	}

	public Object getObj() {
		return this.obj;
	}

	@Override
	public boolean equals(Object o){
		ObjMethod m = (ObjMethod)o;
		return (this.getObj() == m.getObj()) && (this.getMethod().equals(m.getMethod()));
	}
	
	@Override
	public int hashCode(){
		return this.getObj().hashCode() * this.getMethod().hashCode();
	}
}
