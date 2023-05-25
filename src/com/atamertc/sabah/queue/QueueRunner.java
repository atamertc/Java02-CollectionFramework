package com.atamertc.sabah.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueRunner {
    public static void main(String[] args) {

        Queue<String> kuyruk = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Islem secin: ");
            System.out.println("1- Bilet Al");
            System.out.println("2- Bilet Ver");
            System.out.println("3- Kuyruk Goruntule");
            System.out.println("4- Cikis");
            int secim = Integer.parseInt(scanner.nextLine());
            switch (secim) {
                case 1 -> {
                    System.out.println("Adiniz: ");
                    String ad = scanner.nextLine();
                    kuyruk.add(ad);
                    System.out.println(ad+"Kuyruga eklendi");
                }
                case 2 -> {
                    if (kuyruk.isEmpty()) {
                        System.out.println("Kuyruk bos");
                    }
                    String ad2 = kuyruk.poll();
                    System.out.println(ad2+" bilet aldi");
                }
                case 3 -> {
                    System.out.println("Kuyruk durumu = " + kuyruk);
                }
                case 4 -> {
                    System.out.println("Cikildi");
                    System.exit(0);
                }
            }
        }
    }
}
