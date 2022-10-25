package ru.job4j.textanalyzer;

public class NegativeTextAnalyzer extends KeywordAnalyzer{

    public String[] strings = {":(", "=(", ":|"};
    public Label label = Label.NEGATIVE_TEXT;

    @Override
    public String[] getArray() {
        return strings;
    }

    @Override
    public Label getLabel() {
        return label;
    }

}
