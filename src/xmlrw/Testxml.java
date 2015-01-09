package xmlrw;

import org.jdom2.*;
import org.jdom2.output.*;
import java.io.*;

public class Testxml {
	
	public static void Create(){
		String[] strChapter = {"XMLWrite", "XMLVerify","XMLTranslate"};
		Element eRoot = new Element("Art");
		Document docJdom = new Document(eRoot);
		
		//add
		for (int i=0; i<3; i++){
			Element eChapter = new Element("Chapter");
			eChapter.addContent(strChapter[i]);
			eChapter.setAttribute("sort","" + i);
			eRoot.addContent(eChapter);
		}
		
		OutputXML(docJdom,"/home/gateman/Studies/JavaDesignPattern/xml/01.xml");
		System.out.println("Done!");
	};
	
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
