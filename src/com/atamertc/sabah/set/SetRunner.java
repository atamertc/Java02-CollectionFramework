package com.atamertc.sabah.set;

import java.util.HashSet;
import java.util.Iterator;

public class SetRunner {
    //Set bir interfacedir
    //Set bi kumedir ve bir kumede ayni elemandan iki tane olamaz

    //Hashset:
    //eleman degeri ve sirasi ->
    //5 x => 54561
    //6 x => 65987
    //(deger ve sirasi => saklanir burada)
    //Hashlemek denir buna
    //HashSet arka planda HashMap ten yararlanir
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Elma");
        hashSet.add("Armut");
        hashSet.add("Portakal");
        hashSet.add("Kiraz");
        hashSet.add("Armut");

        System.out.println(hashSet);

        //Iterator ile gezinmek
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("Kiraz")) {
                iterator.remove();
            }
        }
        System.out.println(hashSet);
        for (String meyve : hashSet) {
            System.out.println(meyve);
        }
    }

}
