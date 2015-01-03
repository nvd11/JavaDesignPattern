package eventDelegate.test;

import java.util.HashSet;
import java.util.Iterator;
import java.lang.reflect.Method;
public class S {
	private HashSet<ObjMethod> methodList = new HashSet<ObjMethod>();
	
	public void attach(Object obj, String method){
		this.methodList.add(new ObjMethod(obj,method));
	}
	
	public void detach(Object obj, String method){
		this.methodList.remove(new ObjMethod(obj,method));
	}
	
	public void sNotify(){
		if (this.methodList.isEmpty()){
			return;
		}
		
		Iterator<ObjMethod> it = this.methodList.iterator();
		while (it.hasNext()){
			ObjMethod m = (ObjMethod)it.next();
			
			Class<?> objClass = m.getObj().getClass();
			try{
				Method method = objClass.getMethod(m.getMethod(), new Class[]{}); //no any parameters
				method.invoke(m.getObj(),new Object[]{});
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
	}
	
}
