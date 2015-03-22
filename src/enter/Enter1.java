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
import observer.ClientObserver;
import eventDelegate.*;
import callBack.ClientCallback;
import test.*;
import test.sqlServer.*;
import eventDelegate.test.*;
import xmlrw.*;
import xmlrw.test.*;
import abstractFactory.test1.*;

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
		//ClientCarBuilder.f();
		//ClientObserver.f();
		//FormTest1.main(args);
		//ClientCallback.f();
		//Test1.f();
		//ClientSAB.f();
		//Testxml2.Create();
		//Testxml3.Create();
		//ClientXml1.f();
		//ClientXml2.f();
		DBConnection.g();
		//new MsSqlConn().getConn();
	}
}
