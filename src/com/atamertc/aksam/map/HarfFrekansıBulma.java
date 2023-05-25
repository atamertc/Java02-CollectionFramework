package com.atamertc.aksam.map;

import java.util.*;

/*
dısarıdan bır strıng deger alacagız
daha sonra bunu bır mapde saklayacagız
hangı harf kac kere gemıs

m=1
e=1
r=1
h=1
a=2
b=1
 */
public class HarfFrekansıBulma {

    public static void main(String[] args) {

        HarfFrekansıBulma harfFrekansıBulma = new HarfFrekansıBulma();
        Map<Character, Integer> map = new LinkedHashMap<>();
        harfFrekansıBulma.mapeAktar(map);
        map.forEach((k,v)-> System.out.println(k+"-"+v));
    }

    public void mapeAktar(Map<Character,Integer> map) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kelime gir: ");
        String kelime = scanner.nextLine();

        for (int i = 0; i < kelime.length(); i++) {
            if (!map.containsKey(kelime.charAt(i))) {
                map.put(kelime.charAt(i), 1);
            } else {
                map.put(kelime.charAt(i), map.get(kelime.charAt(i)) + 1);
            }
        }
    }
}
