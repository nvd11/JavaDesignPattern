package test;

import java.util.Date;
import java.io.Serializable;
public class Test1 {
	public static void f(){
		Date d = new Date();
		Object[] darr = new Object[10];
		darr[0] = d;
		System.out.println(Date.class);
		if (darr[0]==Date.class){
			System.out.println("123");
		}
	}
}
