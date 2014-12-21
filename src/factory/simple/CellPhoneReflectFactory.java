package factory.simple;

import java.lang.reflect.Constructor;

public class CellPhoneReflectFactory {
	public static CellPhone createCellPhone(String name){
		Class<?> c = null;
		Class<?>[] argTypes = {}; //指明所要调用的构造方法的形参  
		Constructor<?> cst = null;
		CellPhone p = null;
		Object obj = null;
		try {
			c = (Class<?>) Class.forName("factory.simple." + name);
			cst = c.getConstructor(argTypes);//获取指定参数的构造方法
			obj = cst.newInstance(argTypes);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		p = (CellPhone)obj;
		return p;
	}
}
