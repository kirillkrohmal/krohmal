package ru.job4j.textanalyzer;

public class Main {

    public static void main(String[] args) {
        String[] strings = {"new", "year"};
        NegativeTextAnalyzer negativeTextAnalyzer = new NegativeTextAnalyzer();
        SpamAnalyzer spamAnalyzer = new SpamAnalyzer(strings);
        System.out.println(negativeTextAnalyzer.processText("i love gun:("));
        System.out.println(spamAnalyzer.processText("long"));
    }
}
