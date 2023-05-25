package com.atamertc.aksam.queue;

public class Musteri implements Comparable<Musteri>{
    String mIsim;
    int mNo;
    boolean isMusteri;

    public Musteri(String mIsim, int mNo, boolean isMusteri) {
        this.mIsim = mIsim;
        this.mNo = mNo;
        this.isMusteri = isMusteri;
    }

    @Override
    public String toString() {
        return "Musteri{" +
                "mIsim='" + mIsim + '\'' +
                ", mNo=" + mNo +
                ", isMusteri=" + isMusteri +
                '}';
    }

    @Override
    public int compareTo(Musteri o) {
        if (isMusteri) {
            return -1;
        } else if (!isMusteri) {
            return 1;
        }
        return 0;
    }
}
