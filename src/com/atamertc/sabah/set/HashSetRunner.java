package com.atamertc.sabah.set;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetRunner {
    public static void main(String[] args) {
        HashSet<Integer> sayilar = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eleman sayisi gir");
        int elemanSayisi = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < elemanSayisi; i++) {
            System.out.println("Sayi: ");
            sayilar.add(scanner.nextInt());
        }
        System.out.println(sayilar);
    }
}
