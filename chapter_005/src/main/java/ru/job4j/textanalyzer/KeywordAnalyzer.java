package ru.job4j.textanalyzer;

public abstract class KeywordAnalyzer implements TextAnalyzer {
    public abstract String[] getArray ();
    public abstract Label getLabel ();

    @Override
    public Label processText(String text) {
        String[] array = getArray();
        for (int i = 0; i < array.length; i++) {
            if (text.contains(array[i])) {
                return getLabel();
            }
        }

        return Label.OK;
    }


}
