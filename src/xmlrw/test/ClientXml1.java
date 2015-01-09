package xmlrw.test;

import org.jdom2.Document;
import org.jdom2.Namespace;
import org.jdom2.Element;
public class ClientXml1 {
	public static void f(){
		Student sd1 = new Student(1,"Jack",14);
		Student sd2 = new Student(2,"Mike",15);
		Student sd3 = new Student(3,"Paul",15);
		
		// new a xml file
		Document docJdom = new Document();
		
		//Namespace(not must, it's optional, to indicate elements with same name
		Namespace np1 = Namespace.getNamespace("ggl", "www.google.com");
	    Namespace np2 = Namespace.getNamespace("fox","www.firefox.com");
		
		// new a new root node
		Element eRoot = new Element("StudentRecords");
		docJdom.addContent(eRoot);
		
		eRoot.addContent(sd1.buildElement(np1));
		eRoot.addContent(sd2.buildElement(np1));
		eRoot.addContent(sd3.buildElement(np2));
		
		XMLExport.OutputXML(docJdom,"/home/gateman/Studies/JavaDesignPattern/xml/04.xml");
	}
}
