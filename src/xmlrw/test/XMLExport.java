package xmlrw.test;

import org.jdom2.Document;
import org.jdom2.output.XMLOutputter;
import org.jdom2.output.Format;
import java.io.FileWriter;

public class XMLExport {
	public static void OutputXML(Document dXml, String sFilenm){
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
