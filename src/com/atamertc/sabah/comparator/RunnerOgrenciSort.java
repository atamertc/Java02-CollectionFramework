package com.atamertc.sabah.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class RunnerOgrenciSort {
    public static void main(String[] args) {
        //Collections.sort
        ArrayList<String> isimler = new ArrayList<>();
        //ArrayListe eleman ekleme
        isimler.add("Ahmet");
        isimler.add("Kenan");
        isimler.add("Canan");
        isimler.add("Sinan");

        Collections.sort(isimler); // dogal siralama uygular A-Z , kucukten buyuge
        for (String isim :
                isimler) {
            System.out.println(isim);
        }

        System.out.println("-------------------------");

        ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.add(70);
        sayilar.add(20);
        sayilar.add(170);
        sayilar.add(90);
        Collections.sort(sayilar);
        for (Integer sayi :
                sayilar) {
            System.out.println(sayi);
        }
        System.out.println("-------------------------");

        ArrayList<Ogrenci> ogrenciArrayList = new ArrayList<>();
        ogrenciArrayList.add(new Ogrenci("Ata", 26, 75.4));
        ogrenciArrayList.add(new Ogrenci("Selo", 22, 65.3));
        ogrenciArrayList.add(new Ogrenci("Memet", 23, 55.7));
        ogrenciArrayList.add(new Ogrenci("Faruk", 25, 63.9));
        Collections.sort(ogrenciArrayList);
        for (Ogrenci ogrenci :
                ogrenciArrayList) {
            System.out.println(ogrenci.getAd()+"-"+ogrenci.getYas()+"-"+ogrenci.getOrt());
        }
        System.out.println("-------------------------");














    }
}
