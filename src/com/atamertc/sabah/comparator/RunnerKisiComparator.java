package com.atamertc.sabah.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RunnerKisiComparator {
    public static void main(String[] args) {
        List<Kisi> kisiList = new ArrayList<>();
        kisiList.add(new Kisi("Ata", 25, 175));
        kisiList.add(new Kisi("Eda", 24, 166));
        kisiList.add(new Kisi("Can", 25, 178));
        kisiList.add(new Kisi("Kaan", 27, 186));
        kisiList.add(new Kisi("Ece", 24, 155));
        //Once yas esitse boya gore siralayacak
        Comparator<Kisi> comparator = new Comparator<Kisi>() {
            @Override
            public int compare(Kisi k1, Kisi k2) {
                int sonuc = k1.getYas() - k2.getYas();
                if (sonuc == 0) {
                    sonuc = k1.getBoy() - k2.getBoy();
                }
                return sonuc;
            }
        };

        Collections.sort(kisiList, comparator);
        System.out.println(kisiList);









    }
}
