package enter;

import simpleFactory.Form1;
import strategy.Form2;
import decorator.withOutPattern.Client1;
import decorator.HuntClient;
import proxyPattern.ProxyClient;
import factory.simple.FactoryClient1;
import factory.simple.FactoryClient11;
import prototype.withoutclone.*;
import prototype.clone.*;
import prototype.*;
import templateMethod.ClientTemplateMethod;
import lawOfDemeter.ClientDemeter;
import builder.templateMethod.*;
import builder.*;

public class Enter1 {
	public static void main(String args[]){
		//System.out.println("Hello");
		//Form2.newInstance();
		//Client1.hunterHuntRabbit();
		//HuntClient.f();
		//ProxyClient.f();
		//FactoryClient11.f();
		//ClientWithOutClone.f();
		//ClientProtoTypeClone.f();
		//ClientProtoType.f();
		//ClientTemplateMethod.f();
		//ClientDemeter.f();
		//ClientMakeCar.f();
		ClientCarBuilder.f();
	}
}
