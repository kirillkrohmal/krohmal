package ru.job4j.Practice.practicing;

import ru.job4j.Practice.other.Other;

import java.util.List;

/**
 * Created by Comp on 16.11.2017.
 */
public class PoolString {

    private static String it;
    private List<Object> in;

    public String pooly (String String) {
        int i = 10;

        i: for (int j = 0; j < 100; j++) {
            System.out.println();
        }


        return String;
    }

    public void putIt () {
        String a = "string a";
        String b = new String("string a");
        String c = b.intern();




    }

    public <E extends ClassName> List some(List<? super List<ClassName>> in) {



        return null;
    }

    private class ClassName {
    }

    public static void main(String[] args) {

        Other other = new Other();
        it = other.hello3();

        PoolString string = new PoolString();
        string.putIt();

        String hello = "Hello";
        String hello2 = "Hel";
        String lo = "lo";

        Float n = new Float(Float.NaN);
        Float n2 = new Float(Float.NaN);

        System.out.println(n.equals(n2));
        System.out.println(Float.NaN == Float.NaN);
        System.out.println(n == n2);
        System.out.println(hello.equals(hello2 + lo.intern()) );
        System.out.println(hello.equals(hello2 + lo));
        System.out.println(hello.equals(lo));



        String s1 = "Cat";
        String s2 = "Cat";
        String s3 = new String("Cat");

        System.out.println("s1 == s2 :"+(s1==s2));
        System.out.println("s1 == s3 :"+(s1==s3));
    }



}
