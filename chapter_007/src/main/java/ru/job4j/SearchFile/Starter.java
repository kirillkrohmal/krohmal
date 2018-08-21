package ru.job4j.SearchFile;


/**
 * Created by Comp on 21.08.2018.
 */
public class Starter {
    public static void main(String[] args) {
        new Starter().start(args);
    }

    /**
     * Start main loop of program.
     * @param args text for search.
     */
    public void start(String[] args) {
        final StringBuffer buffer = new StringBuffer();
        for (String arg : args) {
            buffer.append(String.format("%s ", arg));
        }
        final Application app = new Application(buffer.toString().trim());
        app.start();
    }
}
