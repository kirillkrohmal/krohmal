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
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws XMLStreamException {
        if (args.length != 1) {
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
