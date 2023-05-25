package com.atamertc.sabah.map;

public class Ogrenci {
    private String ad;
    private String soyAd;
    private int ogrenciNo;

    public Ogrenci(String ad, String soyAd, int ogrenciNo) {
        this.ad = ad;
        this.soyAd = soyAd;
        this.ogrenciNo = ogrenciNo;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyAd='" + soyAd + '\'' +
                ", ogrenciNo=" + ogrenciNo +
                '}';
    }
}
