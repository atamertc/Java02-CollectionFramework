package com.atamertc.sabah.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DequeRunner {
    //Deque: Double Ended Queue
    public static void main(String[] args) {

        Deque<Integer> dek = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Islem secin: ");
            System.out.println("1- Eleman Ekle");
            System.out.println("2- Eleman Cikar");
            System.out.println("3- Dek Goruntule");
            System.out.println("4- Cikis");
            int secim = Integer.parseInt(scanner.nextLine());
            switch (secim) {
                case 1:
                    System.out.println("Sayi gir: ");
                    int sayi = scanner.nextInt();
                    scanner.nextLine();
                    dek.offerLast(sayi);
                    System.out.println(sayi+"Kuyruga eklendi");
                    break;
                case 2:
                    if (dek.isEmpty()) {
                        System.out.println("Kuyruk bos");
                    }
                    int cikarilanSayi = dek.pop();
                    System.out.println(cikarilanSayi+ " cikarildi");
                break;
                case 3:
                    System.out.println("Dek durumu = " + dek);
                break;
                case 4:
                    System.out.println("Cikildi");
                    System.exit(0);
                break;
            }
        }
    }
}
