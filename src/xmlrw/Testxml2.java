package xmlrw;

import org.jdom2.*;
import org.jdom2.output.*;
import java.io.*;

public class Testxml2 {
	
	public static void Create(){
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
		
		//add sd1 node
		Element nodeSd1 = new Element("Student",np1);
		nodeSd1.setNamespace(np1);
		//id
		Element nodeId1 = new Element("id");
		nodeId1.addContent(""+sd1.getId());
		//name
		Element nodeName1 = new Element("name");
		nodeName1.addContent(""+sd1.getName());
		//age
		Element nodeAge1 = new Element("age");
		nodeAge1.addContent(""+sd1.getAge());
		
		nodeSd1.addContent(nodeId1);
		nodeSd1.addContent(nodeName1);
		nodeSd1.addContent(nodeAge1);
		eRoot.addContent(nodeSd1);
		
		//add sd2 node
		Element nodeSd2 = new Element("Student",np1);
		nodeSd2.setNamespace(np1);
		//id
		Element nodeId2 = new Element("id");
		nodeId2.addContent(""+sd2.getId());
		//name
		Element nodeName2 = new Element("name");
		nodeName2.addContent(""+sd2.getName());
		//age
		Element nodeAge2 = new Element("age");
		nodeAge2.addContent(""+sd2.getAge());
		
		nodeSd2.addContent(nodeId2);
		nodeSd2.addContent(nodeName2);
		nodeSd2.addContent(nodeAge2);
		eRoot.addContent(nodeSd2);
		
		//add sd3 node
		Element nodeSd3 = new Element("Student",np2);
		nodeSd3.setNamespace(np2);
		//id
		Element nodeId3 = new Element("id");
		nodeId3.addContent(""+sd3.getId());
		//name
		Element nodeName3 = new Element("name");
		nodeName3.addContent(""+sd3.getName());
		//age
		Element nodeAge3 = new Element("age");
		nodeAge3.addContent(""+sd3.getAge());
		
		nodeSd3.addContent(nodeId3);
		nodeSd3.addContent(nodeName3);
		nodeSd3.addContent(nodeAge3);
		eRoot.addContent(nodeSd3);		
		
		OutputXML(docJdom,"/home/gateman/Studies/JavaDesignPattern/xml/02.xml");
		System.out.println("Done!");
	}
	
	private static void OutputXML(Document dXml, String sFilenm){
		XMLOutputter xot = new XMLOutputter();
		xot.setFormat(Format.getPrettyFormat());
		try{
			FileWriter fwXML = new FileWriter(sFilenm);
			xot.output(dXml, fwXML);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

class Student{
	private int id;
	private String name;
	private int age;
	
	public Student(int id, String name, int age){
		this.setId(id);
		this.setName(name);
		this.setAge(age);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString(){
		return "Student: " + this.getId() + ", " + this.getName() + ", " + this.getAge();
	}

}
