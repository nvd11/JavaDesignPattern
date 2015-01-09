package xmlrw.test;

import org.jdom2.util.IteratorIterable;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.jdom2.filter.ElementFilter;
import java.io.File;
import java.util.Iterator;
import java.lang.Integer;;

public class ClientXml2 {
	public static void f(){
		SAXBuilder sbd = new SAXBuilder();
		Document docJdom = null;
		File xmlfile = null;
		
		try{
			xmlfile = new File("/home/gateman/Studies/JavaDesignPattern/xml/04.xml");
			docJdom = sbd.build(xmlfile);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		Element rootElement = docJdom.getRootElement();
		//all the element named "id" & without namespace
		IteratorIterable<Element> elist = rootElement.getDescendants(new ElementFilter("id"));
		Iterator it = elist.iterator();
	
		Element eId2 = null;
		//loop
		while(it.hasNext()){
			Element em = (Element)(it.next());
			if (2 == new Integer(em.getValue()).intValue()){
				eId2 = em.getParentElement(); 
				break;
			}
		}
		
		//packaging to a Student calss
		Student std = null;
		BuildXmlObj bxj = FactoryXmlObj.getBuildXmlObj("Student");
		std = (Student)(bxj.buildObj(eId2));
		
		System.out.println(std);
	}
}
