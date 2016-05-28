package proxyPattern;

import java.lang.reflect.InvocationHandler;

import proxyPattern.dynamicProxy.dynamicProxyBear;
import proxyPattern.dynamicProxy.StudentMonitor;
import proxyPattern.dynamicProxy.Student;
import proxyPattern.dynamicProxy.Studyable;

public class ProxyClient {
	public static void f(){
		Dog g = new Dog("InterDogChicken");
		ProxyBear b = new ProxyBear();
		
		b.hit(g);
	}
	
	@SuppressWarnings("unchecked")
	public static void g(){
		Dog g = new Dog("InterDogChicken");
		dynamicProxyBear bear = new dynamicProxyBear();
		
		Hitable<Dog> newFox = (Hitable<Dog>) bear.bind(new Fox());
		newFox.hit(g);
		
		Molestable<Dog> newWolf = (Molestable<Dog>) bear.bind(new Wolf());
		newWolf.molest(g);
	}
	
	
	public static void h(){
		StudentMonitor sm = new StudentMonitor();
		Studyable st = (Studyable)sm.bind(new Student("Mike", 59));
		st.beInSchool();
		
		Studyable st2 = (Studyable)sm.bind(new Student("bill", 61));
		st2.beInSchool();
		
		Studyable st3 = (Studyable)sm.bind(new Student("Cici", 59));
		st3.study();
		st3.exam();
		st3.graduate();
	}
}
