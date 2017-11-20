package ru.job4j.OrderBook;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.XMLEvent;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Comp on 20.11.2017.
 */
public class StaxLoader {
    public static void main(String[] args) {
        Handler handler = new Handler();
        List<Book> books = new ArrayList<>();
        XMLInputFactory factory = XMLInputFactory.newInstance();
        try {
            XMLEventReader eventFactory = factory.createXMLEventReader(new FileReader("input.txt"));
            while (eventFactory.hasNext()) {
                XMLEvent event = eventFactory.nextEvent();

                switch (event.getEventType()) {

                }
            }
        } catch (FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
        }
    }
}
