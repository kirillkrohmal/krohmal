package ru.job4j.SearchFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * Created by Comp on 21.08.2018.
 */
public class TextSearcher extends Thread {
    private static final Logger LOG = Logger.getLogger(TextSearcher.class);
    private boolean founded = false;
    private final String searchText;
    private final AtomicBoolean run = new AtomicBoolean(true);
    private final File[] disks = File.listRoots();
    private final FileStorage fileStorage;
    private final List<String> resultFiles;

    public TextSearcher(final String text, final FileStorage storage) {
        this.searchText = text;
        this.fileStorage = storage;
        this.resultFiles = new ArrayList<>();
    }

    public boolean getFounded() {
        return this.founded;
    }

    @Override
    public void run() {
        while (run.get()) {
            searchFromDisk();
        }
    }

    public void brake() {
        this.run.set(false);
        this.interrupt();
    }

    public List<String> getFileList() {
        if (!run.get()) {
            throw new IllegalStateException("Wait for finish of thread work.");
        }
        return this.resultFiles;
    }

    private void searchFromDisk() {
        for (File disk : disks) {
            search(disk.getAbsolutePath());
        }
    }

    private boolean search(String disk) {
        File[] files = new File(disk).listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    search(file.getAbsolutePath());
                } else if (isCorrectFile(file) && !this.isInterrupted()) {
                    processingFile(file, this.searchText);
                }
            }
        }
        return founded;
    }

    private void processingFile(File file, String text) {
        this.founded = readFile(file.getAbsolutePath(), text);
        LOG.log(Level.INFO, String.format("SEARCH AT: %s", file.getAbsolutePath()));
        if (this.founded) {
            LOG.log(Level.INFO, String.format("FOUND AT: %s", file.getAbsolutePath()));
            synchronized (this.resultFiles) {
                this.resultFiles.add(file.getAbsolutePath());
            }
        }
        this.fileStorage.addCheckedFile(file.getAbsolutePath());
    }

    private boolean readFile(String file, String text) {
        boolean find = false;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(file)));
            String line = "";
            while ((line = reader.readLine()) != null) {
                if (line.contains(text)) {
                    find = true;
                }
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        if (file.contains(text)) {
            find = true;
        }
        return find;
    }

    private boolean isCorrectFile(File file) {
        return file.canRead() && !this.fileStorage.isChecked(file.getAbsolutePath()) && !file.isHidden();
    }
}
