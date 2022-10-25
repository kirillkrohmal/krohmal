package ru.job4j.textanalyzer;

public class SpamAnalyzer extends KeywordAnalyzer {

    public String[] strings;
    public Label label = Label.SPAM;

    @Override
    public String[] getArray() {
        return strings;
    }

    @Override
    public Label getLabel() {
        return label;
    }

    public SpamAnalyzer(String[] strings) {
        this.strings = strings;
    }
}
