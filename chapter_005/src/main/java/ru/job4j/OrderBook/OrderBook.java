package ru.job4j.OrderBook;

import com.sun.xml.internal.fastinfoset.stax.factory.StAXEventFactory;

import javax.xml.stream.*;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Comp on 17.10.2017.
 */
public class OrderBook {
    public static void main(String[] args) {
        Handler handler = new Handler();
        List<Book> books = new ArrayList<>();
        XMLInputFactory factory = XMLInputFactory.newInstance();
        try {
            XMLEventReader eventFactory = factory.createXMLEventReader(new FileReader("input.txt"));
            while(eventFactory.hasNext()) {
                XMLEvent event = eventFactory.nextEvent();

                switch (event.getEventType()) {

                }
            }
        } catch (FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
        }

    }
}
