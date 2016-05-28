package proxyPattern.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class dynamicProxyBear implements InvocationHandler {
	//delegate means proxy
	//the object which will be delegated
	private Object delegate;
	
	public Object bind(Object delegate){
		this.delegate = delegate;
		
		/**
		 * This method newProxyInstance return ***one of the interfaces*** of delegate object(properties object of this class)
		 * 
		 * @param 
		 * 		1.ClassLoader loader -> usually use delegate object's class loader
		 * 		2.Class<?>[] interfaces -> collection of the interface which delegate object has implemented
		 * 		3.InvocationHandler h -> this
		 * @return
		 */
		return Proxy.newProxyInstance(delegate.getClass().getClassLoader(), 
									  delegate.getClass().getInterfaces(), this);
				
	}
	
	/**
	 * This method will replace all the method owned by delegate object.
	 * @param proxy -> the delegate object, never use it's method directly, otherwise will lead to Dead loop
	 * @param method -> the method (once execute will fall into this invoke method) object of delegate object 
	 * @param args  -> parameters of the mothod.
	 * @return
	 * @throws Throwable
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object result;
		
		if (args.length < 1){
			return method.invoke(this.delegate,args);
		}
		
		//bear watching
		System.out.println("bear is watching " + args[0].toString());
		result = method.invoke(this.delegate,args);
		System.out.println("bear leaved " + args[0].toString());
		return result;
	}
}
