package com.atamertc.aksam.comparator;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Uygulama {
    ArrayList<Sehir> sehirArrayList = new ArrayList<>();

    public ArrayList<Sehir> sehirOlustur(String[] iller, ArrayList<String> plakaArrayList) {

        for (int i = 0; i < iller.length; i++) {
            Sehir sehir = new Sehir(iller[i], plakaArrayList.get(i));
            sehirArrayList.add(sehir);
        }
        return sehirArrayList;
    }

    public ArrayList<String> plakaOlustur() {
        ArrayList<String> plakaArrayList = new ArrayList<>();
        for (int i = 0; i < SehirDatabase.iller.length; i++) {
            if (i < 9) {
                String plaka = "0" + (i + 1);
                plakaArrayList.add(plaka);
            } else {
                String plaka = String.valueOf(i + 1);
                plakaArrayList.add(plaka);
            }
        }
        return plakaArrayList;
    }

    public ArrayList<Sehir> ileBaslayanIller(ArrayList<Sehir> sehirArrayList, char c) {
        ArrayList<Sehir> ileBaslayanSehir = new ArrayList<>();
        for (int i = 0; i < sehirArrayList.size(); i++) {
            if (sehirArrayList.get(i).getIsim().charAt(0) == c) {
                ileBaslayanSehir.add(sehirArrayList.get(i));
            }
        }
        return ileBaslayanSehir;
    }

    public ArrayList<Sehir> nufusSirala(ArrayList<Sehir> siralanacakListe) {
        Comparator<Sehir> comparator = new Comparator<Sehir>() {
            @Override
            public int compare(Sehir o1, Sehir o2) {
                return o1.getNufus() - o2.getNufus();
            }
        };
        Collections.sort(siralanacakListe, comparator);
        return siralanacakListe;

    }

    public ArrayList<Sehir> isimSirala(ArrayList<Sehir> siralanacakListe) {
        Collator collator = Collator.getInstance();
        Comparator<Sehir> comparator = new Comparator<Sehir>() {
            @Override
            public int compare(Sehir o1, Sehir o2) {
                return collator.compare(o1.getIsim(),o2.getIsim());
            }
        };
        Collections.sort(siralanacakListe, comparator);
        return siralanacakListe;
    }

}
