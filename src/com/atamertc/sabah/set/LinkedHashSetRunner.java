package com.atamertc.sabah.set;

import java.util.LinkedHashSet;

public class LinkedHashSetRunner {
    public static void main(String[] args) {
        //Bunun farki elemanlarin eklenen sira ile siralanmasi
        LinkedHashSet<String> sehirler = new LinkedHashSet<>();
        sehirler.add("Istanbul");
        sehirler.add("Ankara");
        sehirler.add((null));
        sehirler.add("Konya");
        sehirler.add("Izmir");

        System.out.println(sehirler);


    }
}
