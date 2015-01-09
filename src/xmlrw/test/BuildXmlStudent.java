package xmlrw.test;

import org.jdom2.Element;

public class BuildXmlStudent implements BuildXmlObj {
	@Override
	public Object buildObj(Element em) {
		try{
			return new Student(new Integer(em.getChild("id").getValue()).intValue(),  
					em.getChild("name").getValue(),
					new Integer(em.getChild("age").getValue()).intValue()); 
			
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
}
