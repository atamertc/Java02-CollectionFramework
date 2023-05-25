package com.atamertc.aksam.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Uygulama uygulama = new Uygulama();
        ArrayList<Sehir> sehirListesi = uygulama.sehirOlustur(SehirDatabase.iller,uygulama.plakaOlustur());
        System.out.println(uygulama.sehirArrayList);

        System.out.println("--------------------------------------------------");

        ArrayList<Sehir> ileBaslayanSehir = uygulama.ileBaslayanIller(uygulama.sehirArrayList, 'A');
        System.out.println(ileBaslayanSehir);

        //Comparator ile metodla siralama
        sehirListesi = uygulama.isimSirala(sehirListesi);
        System.out.println(sehirListesi);
        System.out.println("-------------------------------");
        //Listeyi bolme
        List<Sehir> sehirList = sehirListesi.subList(sehirListesi.size() - 10, sehirListesi.size());
        System.out.println(sehirList);
        //Listeyi karistirma sortun tersi gibi
        Collections.shuffle(sehirList);
        System.out.println(sehirList);
        System.out.println("*************");
        //Comparable ile implemente ederek siralama
        Collections.sort(sehirList);
        System.out.println(sehirList);






    }
}
