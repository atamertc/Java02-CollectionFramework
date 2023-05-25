package com.atamertc.sabah.set;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetRunner {
    public static void main(String[] args) {

        SortedSet<String> isimler = new TreeSet<>();
        isimler.add("Kamil");
        isimler.add("Cemal");
        isimler.add("Zeynep");
        System.out.println(isimler);

        System.out.println("------------------------------");
        //isimleri uzunluguna gore sirala
        TreeSet<String> isimler2 = new TreeSet<>(Comparator.comparing(String::length));
        isimler2.add("Zeynep");
        isimler2.add("Can");
        isimler2.add("Cemal");
        isimler2.add("Su");
        System.out.println(isimler2);




    }
}
