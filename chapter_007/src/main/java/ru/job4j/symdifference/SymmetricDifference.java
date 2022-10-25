package ru.job4j.symdifference;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference<T> {




   static Set symmetricDifference(Set set1, Set set2) {
        HashSet hashSet1 = new HashSet(set1);
        HashSet hashSet2 = new HashSet(set2);

        hashSet1.removeAll(set2);
        hashSet2.removeAll(set1);

        hashSet1.addAll(hashSet2);
        return hashSet1;
    }

    public static void main(String[] args) {

        Set set1 = new HashSet<>();
        Set set2= new HashSet<>();

        set1.add(6);
        set1.add(7);
        set1.add(1);
        set2.add(6);
        set2.add(7);
        set2.add(3);


        System.out.println(symmetricDifference(set1, set2).toString());
    }
}
