package com.atamertc.sabah.comparator;

public class Kisi {
    private String ad;
    private int yas;
    private int boy;

    public Kisi(String ad, int yas, int boy) {
        this.ad = ad;
        this.yas = yas;
        this.boy = boy;
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

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    @Override
    public String toString() {
        return "\nKisi{" +
                "ad='" + ad + '\'' +
                ", yas=" + yas +
                ", boy=" + boy +
                '}';
    }

}
