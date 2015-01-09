package xmlrw;

import org.jdom2.*;
import org.jdom2.output.*;
import org.jdom2.util.IteratorIterable;
import org.jdom2.input.*;
import org.jdom2.filter.*;

import java.lang.Integer;
import java.io.*;
import java.util.List;
import java.util.Iterator;

public class Testxml3 {
	
	public static void Create(){
		// get a xml DocumentObject
		SAXBuilder sbd = new SAXBuilder();
		Document docJdom = null;
		File xmlfile = null;
		
		try{
			xmlfile = new File("/home/gateman/Studies/JavaDesignPattern/xml/02.xml");
			docJdom = sbd.build(xmlfile);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		Namespace np1 = Namespace.getNamespace("ggl", "www.google.com");
		Namespace np2 = Namespace.getNamespace("fox", "www.firefox.com");
		Element eRoot = docJdom.getRootElement();
		//System.out.println(eRoot.getName());
		//List cl = eRoot.getChildren();
		//System.out.println(eRoot.getChildren().size());
		//Element estd = (Element)cl.get(0);
			
		Element estd = eRoot.getChild("Student",np2);
		if (null==estd){
			System.out.println(1);
		}
		Student std1 = null;
		
		std1 =	new Student(new Integer(estd.getChild("id",np2).getValue()).intValue(),  //will throw Exception..
								estd.getChild("name",np2).getValue(),
								new Integer(estd.getChild("age",np2).getValue()).intValue()); //same as above
		
		
		System.out.println(std1);
		System.out.println(estd.getNamespace());
		System.out.println(estd.getNamespaceURI());
		
		//List cl = eRoot.getContent(new ElementFilter("id",np1));
		List cl = eRoot.getContent();
		List cl2 = docJdom.getContent(new ElementFilter("name"));
		System.out.println(cl2.size());
		List cl3 = eRoot.getChildren("Student", np1);
		IteratorIterable<Element> cl4 = eRoot.getDescendants(new ElementFilter("id",np1));
		Iterator it = cl4.iterator();
		
		while(it.hasNext()){
			Element idnode = (Element)it.next();
			Element parentNode = (Element)idnode.getParent();
			
			if (null==parentNode){
				System.out.println("222");
			}
			
			System.out.println(parentNode.getName());
			
			std1 =	new Student(new Integer(parentNode.getChild("id",np1).getValue()).intValue(),  //will throw Exception..
								parentNode.getChild("name",np1).getValue(),
								new Integer(parentNode.getChild("age",np1).getValue()).intValue()); //same as above
			System.out.println(std1);
		}
		
		estd.getChild("name",np2).removeContent();
		estd.getChild("name",np2).addContent("Lily");
		
		
	
		//OutputXML(docJdom,estd,"/home/gateman/Studies/JavaDesignPattern/xml/02.xml");
		OutputXML(docJdom,"/home/gateman/Studies/JavaDesignPattern/xml/02.xml");
		//System.out.println(cl2.size());
		//System.out.println(cl3.size());
		//System.out.println(eRoot.getContentSize());
		
		
		//List stdlist = eRoot.getContent(new AttributeFilter("id"));
		
	};
	
	private static void OutputXML(Document dXml, Element elm, String sFilenm){
		XMLOutputter xot = new XMLOutputter();
		xot.setFormat(Format.getPrettyFormat());
		try{
			FileWriter fwXML = new FileWriter(sFilenm);
			//xot.output(dXml, fwXML);
			xot.output(elm,fwXML);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	private static void OutputXML(Document dXml, String sFilenm){
		XMLOutputter xot = new XMLOutputter();
		xot.setFormat(Format.getPrettyFormat());
		try{
			FileWriter fwXML = new FileWriter(sFilenm);
			//xot.output(dXml, fwXML);
			xot.output(dXml,fwXML);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

