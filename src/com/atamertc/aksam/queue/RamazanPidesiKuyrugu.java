package com.atamertc.aksam.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class RamazanPidesiKuyrugu {

    public static void main(String[] args) {
        Random random = new Random();

        Queue<String> pideSevdalilari = new ArrayBlockingQueue<>(10);
        pideSevdalilari.offer("Atamert");
        pideSevdalilari.offer("Yaren");
        pideSevdalilari.offer("Buse");
        pideSevdalilari.offer("Kamil");
        pideSevdalilari.offer("Ahmet");
        pideSevdalilari.offer("Fires");
        pideSevdalilari.offer("Furkan");
        pideSevdalilari.offer("Anil");
        pideSevdalilari.offer("Selim");
        pideSevdalilari.offer("Haydar");
        //ArrayBlockingQueue oldugu ve boyut 10 ile sinirli oldugu icin:
        //add() kullanirsak 11. ismi eklemeye calisirken hata verir
        //ancak offer() kullanirsak otomatik olarak eklemez ve devam eder

        int pideSayisi = random.nextInt(1, 11);
        System.out.println("Pide sayisi: "+pideSayisi);

        for (int i = 0; i < pideSayisi; i++) {
            System.out.println(pideSevdalilari.poll()+" pidesini basariyla aldi.");
        }
        for (String pideciler :
                pideSevdalilari) {
            System.out.println("Pidesini alamayan bir mazlum: "+pideciler);
        }



    }
}
