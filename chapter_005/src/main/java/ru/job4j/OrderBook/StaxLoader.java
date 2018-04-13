package ru.job4j.OrderBook;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import javax.xml.transform.stream.StreamSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/**
 * Created by Comp on 20.11.2017.
 */
public class StaxLoader {
   /* public static void main(String[] args) {
        String fileName = "OrderBook/orders.xml";
        List<Orders> ordersList = parseXML(fileName);
        for (Orders orders : ordersList) {
            System.out.println(orders.toString());
        }
    }

    private static List<Orders> parseXML(String fileName) {
        List<Orders> ordersList = new ArrayList<>();
        Orders orders = null;
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        try {
            XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(new FileInputStream(fileName));
            while (xmlEventReader.hasNext()) {
                XMLEvent xmlEvent = xmlEventReader.nextEvent();
                if (xmlEvent.isStartElement()) {
                    StartElement startElement = xmlEvent.asStartElement();
                    if (startElement.getName().getLocalPart().equals("Employee")) {
                        orders = new Orders();
                        //Get the 'id' attribute from Employee element
                        Attribute idAttr = startElement.getAttributeByName(new QName("id"));
                        if (idAttr != null) {
                            orders.setId(Integer.parseInt(idAttr.getValue()));
                        }
                    }
                    //set the other varibles from xml elements
                    else if (startElement.getName().getLocalPart().equals("price")) {
                        xmlEvent = xmlEventReader.nextEvent();
                        orders.setPrice(Float.parseFloat(xmlEvent.asCharacters().getData()));
                    } else if (startElement.getName().getLocalPart().equals("volume")) {
                        xmlEvent = xmlEventReader.nextEvent();
                        orders.setVolume(Integer.parseInt(xmlEvent.asCharacters().getData()));
                    } *//*else if (startElement.getName().getLocalPart().equals("role")) {
                        xmlEvent = xmlEventReader.nextEvent();
                        orders.setAction(xmlEvent.asCharacters().getData());

                    } else if (startElement.getName().getLocalPart().equals("operation")) {
                        xmlEvent = xmlEventReader.nextEvent();
                        orders.setType(Integer. (xmlEvent.asCharacters().getData()));
                    }*//*
                    //if Employee end element is reached, add employee object to list
                    if (xmlEvent.isEndElement()) {
                        EndElement endElement = xmlEvent.asEndElement();
                        if (endElement.getName().getLocalPart().equals("Employee")) {
                            ordersList.add(orders);
                        }
                    }
                }
            }
        } catch (FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
        }
        return ordersList;
    }*/

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws XMLStreamException {
        if (args.length != 1) {
            System.err.println("Bitte XML-Datei angeben, beispielsweise:");
            System.err.println("  java StaxToXPathProperties MyXmlFile.xml");
            return;
        }
        XMLInputFactory inputFactory = XMLInputFactory.newInstance();
        XMLEventReader evRd = inputFactory.createXMLEventReader(new StreamSource(args[0]));
        Stack<String> stck = new Stack<String>();
        while (evRd.hasNext()) {
            XMLEvent ev = evRd.nextEvent();
            if (ev.isStartElement()) {
                stck.push(ev.asStartElement().getName().getLocalPart());
                Iterator<Attribute> iter = ev.asStartElement().getAttributes();
                while (iter.hasNext()) {
                    Attribute a = iter.next();
                    System.out.println(buildXPathString(
                            stck, "/@" + a.getName().getLocalPart() + "=\"" + a.getValue() + "\""));
                }
            }
            if (ev.isCharacters()) {
                String s = ev.asCharacters().getData();
                if (s.trim().length() > 0)
                    System.out.println(buildXPathString(stck, "=\"" + s + "\""));
            }
            if (ev.isEndElement()) stck.pop();
        }
    }

    private static String buildXPathString(Stack<String> stck, String postfix) {
        StringBuffer sb = new StringBuffer();
        for (String s : stck) sb.append("/").append(s);
        sb.append(postfix);
        return sb.toString();
    }
}
