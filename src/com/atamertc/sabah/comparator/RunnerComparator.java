package com.atamertc.sabah.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RunnerComparator {
    public static void main(String[] args) {
        //Anonim inner class:
        Comparator<Integer> comparator = new Comparator<Integer>() {
            /*
            Negatif degerler donerse: o1, o2 den once gelir.
            Pozitif degerler donerse: o2, o1 den once gelir.
            0 donerse: konum degismez
             */
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };
        List<Integer> sayilar = new ArrayList<>(); //Polymorphism
        sayilar.add(70);
        sayilar.add(20);
        sayilar.add(170);
        sayilar.add(90);
        Collections.sort(sayilar, comparator);
        for (Integer sayi :
                sayilar) {
            System.out.println(sayi);
        }
    }
}
