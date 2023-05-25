package com.atamertc.sabah.map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapRunner {
    /*
    HashMap ozelliklerini kullanir arti olarak ekleme sirasini korumaktadir
    LinkedList: Onceki <- deger -> sonraki
    LinkedHashMap: Onceki <- Key+Value - > sonraki
    Eklenen sira onemli ve tutulmasi gerekiyorsa kullanilabilir
    LinkedListin onemli bir ozelligi olan aradaki elemani degistirme hizinin
    yuksek olmasi gibi avantaji barindirir
     */
    public static void main(String[] args) {

        HashMap<String, String> renkler = new HashMap<>();
        renkler.put("Kirmizi", "#FF0000");
        renkler.put("Yesil", "#00FF00");
        renkler.put("Mavi", "#0000FF");
        renkler.put("Sari", "#00FFFF");

        //yazdiralim sira karisik:
        System.out.println(renkler);

        LinkedHashMap<String, String> renkler1 = new LinkedHashMap<>();
        renkler1.put("Kirmizi", "#FF0000");
        renkler1.put("Yesil", "#00FF00");
        renkler1.put("Mavi", "#0000FF");
        renkler1.put("Sari", "#00FFFF");

        //sirali bir sekilde yazdirir girme sirasina gore
        System.out.println(renkler1);


    }
}
