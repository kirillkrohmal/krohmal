package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AttachmentDebug {
    public static void main(String[] args) {
        List<String> attachments = Arrays.asList(
                new String("ie1"),
                new String("image2"),
                new String("ima3")
        );


        Comparator<String> comparator = (left, right) -> {
            System.out.println("compare " + left + " : " + right);
            return left.compareTo(right);
        };

        Comparator<String> cmpDescSize = (left, right) -> {
            System.out.println("compare " + left + " : " + right);
            return right.length() - left.length();
        };
    }
}











