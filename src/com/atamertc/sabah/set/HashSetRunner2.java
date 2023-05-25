package com.atamertc.sabah.set;

import java.util.*;

public class HashSetRunner2 {
    public static void main(String[] args) {

        //Verilen bir cumle icinde gecen farkli kelimelerin sayisini bulun.
        String cumle = "Merhaba Java Programlama Dersinde Java Ogreniyorum";
        HashSet<String> tekrarsiz = new HashSet<>();
        String[] array = cumle.split(" ");
        for (int i = 0; i < array.length; i++) {
            tekrarsiz.add(array[i]);
        }
        System.out.println(tekrarsiz);
        System.out.println("---------------------------");

        //retainAll
        HashSet<Integer> sayilar1 = new HashSet<>();
        HashSet<Integer> sayilar2 = new HashSet<>();
        sayilar1.add(1);
        sayilar1.add(2);
        sayilar1.add(3);
        sayilar1.add(4);
        sayilar1.add(5);

        sayilar2.add(2);
        sayilar2.add(3);
        sayilar2.add(4);
        sayilar2.add(6);

        sayilar1.retainAll(sayilar2);
        System.out.println(sayilar1);

        Iterator<Integer> it = sayilar1.iterator();
        

        //HashSet siralama
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(2);
        set1.add(30);
        set1.add(24);

        List<Integer> siraliSayi = new ArrayList<>(set1);
        System.out.println("Sirasiz: " + siraliSayi);
        Collections.sort(siraliSayi);
        System.out.println("Sirali: " + siraliSayi);
        //Collection.sort(set1) --> hata verir, HashSet kabul etmez. List ister.




    }
}
