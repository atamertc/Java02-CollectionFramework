package com.atamertc.sabah.map;

import java.util.HashMap;
import java.util.Map;

public class OgrenciRunner {
    public static void main(String[] args) {
        Map<Integer, Ogrenci> ogrenciler = new HashMap<>();
        Ogrenci ogrenci1 = new Ogrenci("Ali", "Tok", 212);
        Ogrenci ogrenci2 = new Ogrenci("Doruk", "Inan", 213);
        Ogrenci ogrenci3 = new Ogrenci("Berk", "Ak", 214);
        ogrenciler.put(ogrenci1.getOgrenciNo(), ogrenci1);
        ogrenciler.put(ogrenci2.getOgrenciNo(), ogrenci2);
        ogrenciler.put(ogrenci3.getOgrenciNo(), ogrenci3);

        //213 nolu ogrencinin bilgilerini yazdirin:
        Ogrenci arananOgrenci = ogrenciler.get(213);
        System.out.println(arananOgrenci.getAd() + " " + arananOgrenci.getSoyAd());

        //Ogrenci classi icine toString() atince yukariya gerek kalmiyor
        System.out.println(ogrenciler.get(213));






    }
}
