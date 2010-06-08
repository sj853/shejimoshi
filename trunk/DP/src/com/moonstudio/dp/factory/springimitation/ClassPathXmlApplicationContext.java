package com.moonstudio.springimitation.factory;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.xpath.XPath;

public class ClassPathXmlApplicationContext implements BeanFactory {

	public HashMap<String, Object> container = new HashMap<String, Object>();

	@Override
	public Object getBean(String id) {
		return container.get(id);
	}

	public ClassPathXmlApplicationContext(String fileName)
			throws JDOMException, IOException, ClassNotFoundException,
			InstantiationException, IllegalAccessException {
		SAXBuilder sb = new SAXBuilder();
		Document doc = sb.build(this.getClass().getClassLoader()
				.getResourceAsStream(fileName));
		Element root = doc.getRootElement();
		List list = XPath.selectNodes(root, "/beans/bean");
		for (int i = 0; i < list.size(); i++) {
			Element bean = (Element) list.get(i);
			String id = bean.getAttributeValue("id");
			String clazz = bean.getAttributeValue("class");
			Object o = Class.forName(clazz).newInstance();
			container.put(id, o);
		}
	}

}
