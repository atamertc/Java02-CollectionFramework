package com.atamertc.sabah.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapRunner {
    public static void main(String[] args) {

        HashMap<String, Integer> ogrenciler = new HashMap<>();
        ogrenciler.put("Engin", 25);
        ogrenciler.put("Ahmet", 26);
        ogrenciler.put("Cengiz", 32);
        ogrenciler.put("Mahmut", 31);
        ogrenciler.put("Serdar", 34);
        //Keyin icinde var mi diye kontrol ederek atama daha mantikli
        if (!ogrenciler.containsKey("Serdar")) {
            ogrenciler.put("Serdar", 40);//Sadece key'deki degeri guncellemis oldu
        }
        //Siralama yok gene hashlerde rastgele gosterecek
        System.out.println(ogrenciler);

        System.out.println(ogrenciler.containsValue(31));

        //get() metodunda metoda key verilir bize o keyin value degerini doner
        int yas = ogrenciler.get("Ahmet");
        System.out.println(yas);

        //sadece keyleri gormek istiyorsak keySet()
        Set<String> keys = ogrenciler.keySet();
        System.out.println("Keys: " + keys);
        System.out.println("Values: " + ogrenciler.values());
        //hem key hem value almak icin entrySet()
        Set<Map.Entry<String, Integer>> kayitlar = ogrenciler.entrySet();
        System.out.println("Kayitlar: " + kayitlar);

        //replace , putlada aynisini yapiyoduk bunda eski deger dogruysa atama yapiyor
        ogrenciler.replace("Cengiz",31,100);
        System.out.println("Cengiz yeni yas: " + kayitlar);

        //remove
        ogrenciler.remove("Cengiz");
        System.out.println("Cengiz remove: " + kayitlar);

        //clear
//        ogrenciler.clear();
//        System.out.println("Clear: "+kayitlar);
        System.out.println("----------------------------");
        //foreach ile ayrica yazdirma ise yarayabilir bazen
        ogrenciler.forEach((k,v)-> System.out.println("Ogrenci Ad: "+k+" - Yas: "+v));
        System.out.println("----------------------------");

        //replaceAll (Sadece v ler uzerinde degisiklik yapilabilir)
        ogrenciler.replaceAll((k,v)-> v+1);
        System.out.println("replaceAll: " + ogrenciler);
        System.out.println("-----------------------------");

        Map<String, int[]> ogrenciBilgiler = new HashMap<>();
        ogrenciBilgiler.put("Ata", new int[]{50, 70});
        ogrenciBilgiler.put("Berk", new int[]{60, 80});
        ogrenciBilgiler.put("Tokin", new int[]{90, 100});
        //Not ortalamalarini yazdirma
        for (String ogrenciKey :
                ogrenciBilgiler.keySet()) {
            int[] notlar = ogrenciBilgiler.get(ogrenciKey);
            int toplam = 0;
            for (int not :
                    notlar) {
                toplam += not;
            }
            double ort = (double) toplam / notlar.length;
            System.out.println(ogrenciKey+" Not ort: "+ort);
        }
        System.out.println("---------------------------");



    }
}
