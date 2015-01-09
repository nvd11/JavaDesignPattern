package xmlrw.test;

public class FactoryXmlObj {
	public static BuildXmlObj getBuildXmlObj(String name){
		BuildXmlObj bxj = null;
		switch(name){
		case "Student" :
			bxj = new BuildXmlStudent();
			break;
		//..
		}
		
		return bxj;
	}

}
