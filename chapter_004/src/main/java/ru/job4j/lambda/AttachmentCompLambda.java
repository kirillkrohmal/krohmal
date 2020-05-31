package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AttachmentCompLambda {
    public static void main(String[] args) {
        List<String> attachments = Arrays.asList(
                new String("ie1"),
                new String("image2"),
                new String("ima3")
        );


        Comparator<String> comparator = (left, right) -> left.compareTo(right);

        Comparator<String> cmpDescSize = (left, right) -> right.length() - left.length();

        attachments.sort(cmpDescSize);

        System.out.println(attachments);
    }
}











