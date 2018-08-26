package ru.job4j.SearchFile;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by Comp on 21.08.2018.
 */
public class Application extends Thread {
    private TextSearcher textSearcher;
    private final FileStorage fileStorage;
    private final String text;
    private final AtomicBoolean run = new AtomicBoolean(true);
    private boolean init = false;

    public Application(final String text) {
        this.text = text;
        this.fileStorage = new FileStorage();
    }

    @Override
    public void run() {
        while (run.get()) {
            if (!init) {
                initAllThread();
            } else if (run.get()) {
                if (textSearcher.getFounded()) {
                    run.set(false);
                    textSearcher.brake();
                }
            }
        }
    }

    private void initAllThread() {
        init = true;
        this.textSearcher = new TextSearcher(this.text, this.fileStorage);
        this.textSearcher.start();
    }
}
