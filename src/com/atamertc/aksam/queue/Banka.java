package com.atamertc.aksam.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Banka {
    private Queue<Musteri> musteriQueue = new PriorityQueue<>(new Comparator<Musteri>() {
        @Override
        public int compare(Musteri o1, Musteri o2) {
            if (o1.isMusteri && o2.isMusteri) {
                return o1.mNo - o2.mNo;
            } else if (o1.isMusteri) {
                return -1;
            } else if (!o1.isMusteri && !o2.isMusteri) {
                return o1.mNo - o2.mNo;
            }
            return 1;
        }
    });
    public void kuyrukEkle() {

        musteriQueue.offer(new Musteri("Ata",5, false));
        musteriQueue.offer(new Musteri("Cenk", 1,true));
        musteriQueue.offer(new Musteri("Deniz", 4,true));
        musteriQueue.offer(new Musteri("Anil", 2,false));
        musteriQueue.offer(new Musteri("Mert", 3,true));
        musteriQueue.offer(new Musteri("Cakir", 6,false));
        musteriQueue.offer(new Musteri("Hakan", 7, true));
    }

    public void kuyrukYazdir() {
        while (!musteriQueue.isEmpty()) {
            System.out.println(musteriQueue.poll());
        }
    }

    public static void main(String[] args) {
        Banka banka = new Banka();
        banka.kuyrukEkle();
        banka.kuyrukYazdir();

    }


}
