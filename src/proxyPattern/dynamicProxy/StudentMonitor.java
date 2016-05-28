package proxyPattern.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class StudentMonitor implements InvocationHandler{
	private Object delegate;
	
	private boolean flag = false;
	
	public Object bind(Object delegate){
		this.delegate = delegate;
		return Proxy.newProxyInstance(delegate.getClass().getClassLoader(), 
									  delegate.getClass().getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		
		System.out.println("start to execute " + method.getName());
		Object result;
		
		if(method.getName().equals("exam")){
			result = method.invoke(this.delegate, args);
			if ((Integer)result >= 60){
				this.flag = true;
			}else{
				this.flag = false;
			}
			return result;
		}
		
		if(method.getName().equals("graduate")){
			if(this.flag == true){
				return method.invoke(this.delegate, args);
			}
			
			System.out.println(this.delegate + " exam result < 60,cannot graduate");
			return null;
		}
		
		return method.invoke(this.delegate, args);
	}
	

}
