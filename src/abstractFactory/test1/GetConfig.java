package abstractFactory.test1;

import org.jdom2.input.SAXBuilder;
import org.jdom2.Document;
import org.jdom2.Element;
import java.io.File;
public class GetConfig {
	private static String clsPath = new GetConfig().getClass().getResource(File.separator).getPath(); 
	private static String xmlStr = clsPath + "abstractFactory" + File.separator + "test1"
									+ File.separator + "Config.xml";
	
	private static Document xmldoc;
	private static Element dbElement;
	
	private static Document getXmldoc(){
		if (null!=xmldoc){
			return xmldoc;
		}
			
		System.out.println(xmlStr);
		SAXBuilder sbd = new SAXBuilder();
		try{
			xmldoc = sbd.build(new File(xmlStr));
		}catch(Exception e){
			e.printStackTrace();
			System.exit(-1);
		}
		
		return xmldoc;
	}
	
	public static String getDBType(){
		Document xml = getXmldoc();
		Element nodeDBType = xml.getRootElement().getChild("DB").getChild("DBType");
		return nodeDBType.getValue();
	}
	
	public static String getDBServer(){
		Document xml = getXmldoc();
		Element nodeDB = xml.getRootElement().getChild("DB").getChild(getDBType());
		return nodeDB.getChild("DBServer").getValue();
	}
	
	public static String getDBPort(){
		Document xml = getXmldoc();
		Element nodePort = xml.getRootElement().getChild("DB").getChild(getDBType());
		return nodePort.getChild("Port").getValue();
	}

	public static String getDBName(){
		Document xml = getXmldoc();
		Element nodeDBName = xml.getRootElement().getChild("DB").getChild(getDBType());
		return nodeDBName.getChild("DBName").getValue();
	}
	
	public static String getDBLogin(){
		Document xml = getXmldoc();
		Element nodeLogin = xml.getRootElement().getChild("DB").getChild(getDBType());
		return nodeLogin.getChild("Login").getValue();
	}
	
	public static String getDBPwd(){
		Document xml = getXmldoc();
		Element nodePwd = xml.getRootElement().getChild("DB").getChild(getDBType());
		return nodePwd.getChild("Password").getValue();
	}
	
}
