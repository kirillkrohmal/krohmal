package ru.job4j.textanalyzer;

public class TooLongTextAnalyzer implements TextAnalyzer{

    int anInt;

    public TooLongTextAnalyzer(int anInt) {
        this.anInt = anInt;
    }

    @Override
    public Label processText(String text) {
        return text.length() > anInt ? Label.TOO_LONG : Label.OK;
    }
}
