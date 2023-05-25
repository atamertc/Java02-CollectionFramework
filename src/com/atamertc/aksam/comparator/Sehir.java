package com.atamertc.aksam.comparator;

import java.util.Random;

public class Sehir implements Comparable<Sehir>{
    private String isim;
    private String plakaKodu;
    private int nufus;

    public Sehir(String isim, String plakaKodu) {
        this.isim = isim;
        this.plakaKodu = plakaKodu;
        this.nufus = nufusOlustur();
    }

    private int nufusOlustur() {
        Random random = new Random();
        int nufus = random.nextInt(100000, 2000000);
        return nufus;
    }


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getPlakaKodu() {
        return plakaKodu;
    }

    public void setPlakaKodu(String plakaKodu) {
        this.plakaKodu = plakaKodu;
    }

    public int getNufus() {
        return nufus;
    }

    public void setNufus(int nufus) {
        this.nufus = nufus;
    }

    @Override
    public String toString() {
        return "\nSehir{" +
                "isim='" + isim + '\'' +
                ", plakaKodu='" + plakaKodu + '\'' +
                ", nufus=" + nufus +
                '}';
    }

    @Override
    public int compareTo(Sehir o) {
//        if (Integer.parseInt(this.plakaKodu) < Integer.parseInt(o.plakaKodu)) {
//            return -1;
//        } else if (Integer.parseInt(this.plakaKodu) > Integer.parseInt(o.plakaKodu)) {
//            return 1;
//        } else {
//            return 0;
//        }
        return this.plakaKodu.compareTo(o.plakaKodu);
    }
}
