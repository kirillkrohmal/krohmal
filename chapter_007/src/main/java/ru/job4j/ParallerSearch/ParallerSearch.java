package ru.job4j.ParallerSearch;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Comp on 21.07.2018.
 */

@ThreadSafe
public class ParallerSearch {
    private final String root;
    private final String text;
    private final List<String> exts;

    @GuardedBy("this")
    private final Queue<String> files = new LinkedList<>();

    @GuardedBy("this")
    private final List<String> paths = new ArrayList<>();


    public ParallerSearch(String root, String text, List<String> exts) {
        this.root = root;
        this.text = text;
        this.exts = exts;
    }

    public void init() {
        Thread search = new Thread() {
            @Override
            public void run() {
                super.run();
            }
        };
        Thread read = new Thread() {
            @Override
            public void run() {
                super.run();
            }
        };
    }

    synchronized List<String> result() {
        return this.paths;
    }
}
