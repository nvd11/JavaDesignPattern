package xmlrw.test;

import org.jdom2.Element;
import org.jdom2.Namespace;

public class Student implements XMLable {
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

	@Override
	public Element buildElement(Namespace np) {
		Element node = new Element("Student",np);
		node.setNamespace(np);
		//id
		Element nodeId = new Element("id");
		nodeId.addContent(""+this.getId());
		//name
		Element nodeName = new Element("name");
		nodeName.addContent(""+this.getName());
		//age
		Element nodeAge = new Element("age");
		nodeAge.addContent(""+this.getAge());
		
		node.addContent(nodeId);
		node.addContent(nodeName);
		node.addContent(nodeAge);
		return node;
	}
}
