package com.atamertc.sabah.comparator;

public class Ogrenci implements Comparable<Ogrenci>{
    private String ad;
    private int yas;
    private double ort;

    public Ogrenci(String ad, int yas, double ort) {
        this.ad = ad;
        this.yas = yas;
        this.ort = ort;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public double getOrt() {
        return ort;
    }

    public void setOrt(double ort) {
        this.ort = ort;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", yas=" + yas +
                ", ort=" + ort +
                '}';
    }

    @Override
    public int compareTo(Ogrenci o) {
        if (this.yas < o.yas) {
            return 1;
        } else if (this.yas > o.yas) {
            return -1;
        } else {
            return 0;
        }
    }





}
