package com.atamertc.sabah.map;

import java.util.TreeMap;

public class TreeMapRunner {
/*
Ogeleri key'lere gore dogal sirali bir sekilde tutar
Dogal sira: Kucukten buyuge, A dan Z ye

 */
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("a", 10);
        treeMap.put("b", 2);
        treeMap.put("c", 5);
        treeMap.put("d", 3);
        treeMap.put("e", 4);

        System.out.println(treeMap);

        System.out.println(treeMap.size()); //eleman sayisi:5

        //Key verip value almaya calisiyorsak:
        System.out.println(treeMap.get("b"));

        //Ilk keye ait value degerini doner
        System.out.println(treeMap.firstKey());

        //Son key degerine ait value doner
        System.out.println(treeMap.lastKey());

        //Ilk siradaki hem key hem value doner
        System.out.println(treeMap.firstEntry());

        //Butun value degerlerini doner
        System.out.println(treeMap.values());

        //Butun kayitlari doner
        System.out.println(treeMap.entrySet());

    }
}
