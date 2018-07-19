package ru.job4j.OrderBook;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.events.*;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by Comp on 20.11.2017.
 */
public class StaxLoader {
    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();

        XMLInputFactory inputFactory = XMLInputFactory.newInstance();
        InputStream inputStream = new FileInputStream("C:/orders.xml");
        XMLEventReader evRd = inputFactory.createXMLEventReader(inputStream);

        while (evRd.hasNext()) {
            XMLEvent ev = evRd.nextEvent();

            if (ev.isStartElement()) {
                StartElement startElement = ev.asStartElement();
                startElement.getName().getLocalPart();
            }
        }

        System.out.println(String.format("Время работы: %s s", (System.currentTimeMillis() - start)));
    }
}

