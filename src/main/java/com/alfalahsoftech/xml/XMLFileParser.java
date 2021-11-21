package com.alfalahsoftech.xml;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLFileParser {
	public static void main(String[] args) {
		XMLFileParser fileParser = new XMLFileParser();
		fileParser.readXMLFile();
	}
	
	public void readXMLFile() {
		try {
			
			File file = new File(this.getClass().getClassLoader().getSystemResource("Students_Record.xml").getPath());
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(file);
			
			document.getDocumentElement().normalize();
			 System.out.println("Root element :" + document.getDocumentElement().getNodeName());
			 NodeList  nodeList   = document.getElementsByTagName("student");
			 for (int i = 0; i < nodeList.getLength(); i++) {
				 Node node = nodeList.item(i);
				 
				 if(node.getNodeType() == Node.ELEMENT_NODE) {
					 System.out.println("Node: " + node.getAttributes().item(0) );
					 Element ele = (Element)node;
					 
				 }
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
