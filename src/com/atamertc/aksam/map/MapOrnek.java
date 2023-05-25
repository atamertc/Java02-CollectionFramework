package com.atamertc.aksam.map;

import java.util.HashMap;
import java.util.Map;

public class MapOrnek {
    static String[] calisanlar = {"Mustafa", "Oznur", "Elif"};
    static int[] ids = {1, 2, 3};

    static Integer[][] harcamalar = {{500, 400, 120}, {100, 200, 800}, {500, 750, 1200}};

    public static void main(String[] args) {

        Map<Integer, String> isimler = new HashMap<>();
        for (int i = 0; i < calisanlar.length; i++) {
            isimler.put(ids[i], calisanlar[i]);
        }
        System.out.println(isimler);

        Map<String, Integer[]> harcamalarMap = new HashMap<>();

        for (int i = 0; i < ids.length; i++) {
            harcamalarMap.put(calisanlar[i], harcamalar[i]);
        }
        for (Map.Entry<String, Integer[]> harcama : harcamalarMap.entrySet()) {
            System.out.print("\n" + harcama.getKey());
            for (Integer deger :
                    harcama.getValue()) {
                System.out.print("-" + deger);
            }
        }


    }

}
