package com.atamertc.aksam.stack;

import java.util.Iterator;
import java.util.Stack;

/*
 * integer bir stack olusturup içcerisine 5 6 tane değer ekleyelim
 * 100 den buyuk olanları toplam değerine ekleyelim 100den kucuk
 * olanlarıda başka bir stack yapısında
 * tutalım en sonundada toplamı ve diğer stack i yazdıralım
 */
public class ParaSayma {
    public static void main(String[] args) {
        Stack<Integer> sayilar = new Stack<>();
        Stack<Integer> sayilar2 = new Stack<>();

        sayilar.add(24);
        sayilar.add(55);
        sayilar.add(78);
        sayilar.add(105);
        sayilar.add(179);
        sayilar.add(256);

        int toplam = 0;
        while (!sayilar.isEmpty()) {
            if (sayilar.peek() > 100) {
                toplam += sayilar.pop();
            } else {
                sayilar2.push(sayilar.pop());
            }
        }
        System.out.println(sayilar2);
        System.out.println(toplam);


    }
}
