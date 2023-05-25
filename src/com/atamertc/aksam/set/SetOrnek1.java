package com.atamertc.aksam.set;

public class SetOrnek1 {
    public static void main(String[] args) {
        int anapara=120000;
        double faiz=2.09;
        int donem=36;

        double birikimliTutar = anapara * (((faiz * (1 + faiz) * donem)) / ((1 + faiz) * (donem - 1)));
        System.out.println(birikimliTutar);
    }
    
}
