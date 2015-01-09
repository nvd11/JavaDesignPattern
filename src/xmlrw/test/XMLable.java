package xmlrw.test;


import org.jdom2.Element;
import org.jdom2.Namespace;
public interface XMLable {
	public Element buildElement(Namespace np);
}
