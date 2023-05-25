package com.atamertc.sabah.arrayList;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        //ArrayList olusturma
        ArrayList<String> isimler = new ArrayList<>();
        //ArrayListe eleman ekleme
        isimler.add("Ahmet");
        isimler.add("Kenan");
        isimler.add("Canan");
        isimler.add("Sinan");

        Iterator<String> iterator = isimler.iterator();
        //Iterator ile ArrayList icerisinde sadece ileri dogru gezinme yapilabilir
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("-------------------------------------");

        ListIterator<String> listIterator = isimler.listIterator();
        //ListIterator ile hem ileri hem geri itere edilebilir
        listIterator.add("SU");
        listIterator.remove();
        listIterator.next();
        listIterator.next();
        while (listIterator.hasPrevious()) {
            if (listIterator.equals("Kenan")) {

            }
            System.out.println(listIterator.previous());
        }









    }
}
