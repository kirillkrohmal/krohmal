package ru.job4j.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Comp on 19.10.2017.
 */
class Chapter1<T> {

    void printBalance() {
        for (int i = 0; i < withdraw(); i++) {

        }
    }

    public Integer withdraw () {

        return null;
    }
    public Integer deposit () {

        return null;
    }

    private Card[] cards = new Card[]{
        Card.ACE_CASE, Card.ACE_BASE, Card.ACE_GHANGE, Card.DUMP_CASE,
    };


    public List<Card> deck;



    public Chapter1() {
        deck = new ArrayList<>();
        for (int i = 0; i < cards.length; i++) {
            deck.add(cards[i]);
            cards[i] = null;
        }
        //Collections.sort(deck);
    }

    public Integer operand () {

        int s1 = 1;
        int s2 = 2;
        int s3 = 0;
        s3 = s1 & s2;

        System.out.println("a & b = " + s3);

        return s3;
    }


    public static void main(String[] args) {
        int s1 = 1;
        int s2 = 2;
        int s3 = 12;
        //s3 = s1 & s2;
        s3 |= s1;
        s1 = ~ s2;

        System.out.println("a & b = " + s3);
        System.out.println("a ~ b = " + s1);

    }

    private static class Card {
        public static final Card ACE_CASE = null;
        public static final Card ACE_BASE = null;
        public static final Card ACE_GHANGE = null;
        public static final Card DUMP_CASE = null;
    }
}
