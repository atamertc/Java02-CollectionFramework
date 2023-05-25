package com.atamertc.sabah.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RunnerArrayList {
    public static void main(String[] args) {
        //ArrayList tanimlamalar:
        //Kapasitesi 10 olan bir ArrayList olusturur
//        ArrayList<Integer> sayilar = new ArrayList<>(5);//default capacity: 10
//        for (Integer sayi :
//                sayilar) {
//            System.out.println(sayi);
//        }
//        System.out.println(sayilar.size()); // icindeki eleman adedini gosterir
        System.out.println("--------------------------------");
        //Arrayi ArrayListe cevirme
        Integer[] sayiArrayi = {2, 4, 6};
        ArrayList<Integer> sayilar = new ArrayList<>(Arrays.asList(sayiArrayi));
        for (Integer sayi :
                sayilar) {
            System.out.println(sayi);
        }
        System.out.println("--------------------------------");
        //Bir ArrayListin kopyasini alma
        ArrayList<Integer> sayilar2 = new ArrayList<>(sayilar);
        sayilar2.add(15);
        for (Integer sayi :
                sayilar2) {
            System.out.println(sayi);
        }
        System.out.println("--------------------------------");
        //ArrayListe addAll ile eleman ekleme
        ArrayList<Integer> sayilar3 = new ArrayList<>();
        sayilar3.add(3000);
        sayilar3.add(4000);
        System.out.println("Sayilar3: " + sayilar3);
        System.out.println("Sayilar2: " + sayilar2);
        sayilar3.addAll(sayilar2);
        System.out.println("Sayilar3.addAll(sayilar2): " + sayilar3);
        System.out.println("Sayilar3: " + sayilar3);
        System.out.println("Sayilar2: " + sayilar2);
        System.out.println("--------------------------------");

        //size(): listedeki eleman sayisi
        System.out.println("size()-> " + sayilar3.size());
        System.out.println("--------------------------------");
        //get(): belirli bir indexteki elemani gor
        System.out.println("get()-> " + sayilar3.get(2));
        System.out.println("--------------------------------");
        //set(): belirli bir indexteki elemani degistir
        sayilar3.set(2, 3500);
        System.out.println("set()-> " + sayilar3);
        System.out.println("--------------------------------");
        //remove(): elemani kaldirir
        sayilar3.remove(2);
        System.out.println("remove()-> " + sayilar3);
        System.out.println("--------------------------------");
        //clear(): ArrayListi  temizler, elemanlari siler
        sayilar3.clear();
        System.out.println("clear()-> " + sayilar3);
        System.out.println("--------------------------------");
        System.out.println(sayilar3.isEmpty());
        System.out.println("--------------------------------");
        //sayilar3 u tekrar dolduralim islem yapmak icin
        sayilar3.addAll(sayilar2);
        System.out.println(sayilar3);
        System.out.println("--------------------------------");
        //indexOf(): verilen elemanin indexini bulur
        int index = sayilar3.indexOf(6);
        System.out.println("indexOf()-> "+index);
        System.out.println("--------------------------------");
        //sublist(): listeden belirli bir araliktaki elemanlari almak
        List<Integer> altListe = new ArrayList<>();
        altListe = sayilar3.subList(0, 3);
        System.out.println("subList()-> "+altListe);
        System.out.println("--------------------------------");
        //contains() eleman varsa true yoksa false doner
        System.out.println("contains()-> " + sayilar3.contains(1000));
        System.out.println("--------------------------------");
        //toArray() listedeki elemanlari dizi ye aktarir
        Integer[] sayiDizisi = new Integer[sayilar3.size()];
        sayilar3.toArray(sayiDizisi);
        for (Integer sayi : sayiDizisi) {
            System.out.println(sayi);
        }














    }
}
