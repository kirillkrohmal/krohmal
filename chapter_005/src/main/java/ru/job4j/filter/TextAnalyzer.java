package ru.job4j.filter;

public interface TextAnalyzer {
    enum Label {
        SPAM, NEGATIVE_TEXT, TOO_LONG, OK
    }


    Label processText(String text);
}
