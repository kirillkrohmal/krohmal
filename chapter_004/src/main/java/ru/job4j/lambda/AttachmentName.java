package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AttachmentName {
    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("name 1", 1),
                new Attachment("name 2", 3),
                new Attachment("name 3", 13)
        );
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Attachment left = (Attachment) o1;
                Attachment right = (Attachment) o2;
                return left.getName().compareTo(right.getName());
            }
        };

        attachments.sort(comparator);
        System.out.println(attachments);
    }
}



