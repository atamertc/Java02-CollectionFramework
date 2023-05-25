package com.atamertc.sabah.map;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class MusteriTreeMap {

    public static void main(String[] args) {

        TreeMap<String, ArrayList<String>> musteriMap = new TreeMap<>();
        musteriEkle(musteriMap, "Ali", "Ankara");
        musteriEkle(musteriMap, "Ayse", "Istanbul");
        musteriEkle(musteriMap, "Ceren", "Bolu");
        musteriEkle(musteriMap, "Cemil", "Ankara");

        for (Map.Entry<String, ArrayList<String>> entry :
                musteriMap.entrySet()) {
            String key = entry.getKey();
            ArrayList<String> val = entry.getValue();
            System.out.println(key+".");
            for (String musteri :
                    val) {
                System.out.println(musteri);
        }            }


}

    //ekleme metodu
    public static void musteriEkle(TreeMap<String, ArrayList<String>> musteriMap, String isim, String sehir) {
        //bas harflerine gore gruplandirarak listelemek istiyorum:
        String ilkHarf = isim.substring(0, 1).toUpperCase();
        if (!musteriMap.containsKey(ilkHarf)) {
            musteriMap.put(ilkHarf, new ArrayList<String>());
        }
        ArrayList<String> musteriIsimler = musteriMap.get(ilkHarf);
        musteriIsimler.add(isim + " " + sehir);
    }
}
