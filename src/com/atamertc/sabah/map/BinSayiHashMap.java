package com.atamertc.sabah.map;

import java.util.*;
import java.util.stream.Collectors;

public class BinSayiHashMap {
    //bin tane rastgele sayi uretin (1-1000) arasinda
    //bunlari 1 mapin icerisinde tutmamiz gerekiyor
    //bu sayilari HashMap icinde olacak
    //Hangi sayidan kacar adet uretildigide key value olarak tutulacak
    //en cok uretilen sayi en ustte olacak sekilde siralayarak geri donun


    public static void main(String[] args) {
        BinSayiHashMap binSayiHashMap = new BinSayiHashMap();
        Map<Integer, Integer> map = new LinkedHashMap<>();
        binSayiHashMap.mapeAktar(map);
        map.forEach((k, v) -> System.out.println(k + "-" + v));
        System.out.println("*=*=*=*==*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
        Collections.sort(entryList, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        entryList.forEach(System.out::println);
    }

    public void mapeAktar(Map<Integer, Integer> map) {
        Random random = new Random();
        Integer[] sayilar = new Integer[1000];
        for (int i = 0; i < 1000; i++) {
            sayilar[i] = random.nextInt(1, 1001);
        }

        for (int i = 0; i < sayilar.length; i++) {
            if (!map.containsKey(sayilar[i])) {
                map.put(sayilar[i], 1);
            } else {
                map.put(sayilar[i], map.get(sayilar[i]) + 1);
            }
        }
    }

}
