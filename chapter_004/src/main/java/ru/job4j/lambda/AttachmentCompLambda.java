package ru.job4j.lambda;

import java.util.Comparator;

public class AttachmentCompLambda {
    Comparator<String> comparator = (left, right) -> left.compareTo(right);

    Comparator<String> cmpDescSize = (left, right) -> right.length() - left.length();

}











