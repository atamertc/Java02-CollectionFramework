package com.atamertc.sabah.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QuizGameRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> soruCevap = new HashMap<>();
        soruCevap.put("5 + 7 = ?", "12");
        soruCevap.put("Baskent neresi", "Ankara");
        soruCevap.put("10 + 1 = ?", "11");

        int dogruCevapSayisi = 0;
        System.out.println("Oyuna hosgeldiniz: ");
        for (Map.Entry<String, String> entry : soruCevap.entrySet()) {
            String key = entry.getKey();
            String val = entry.getValue();
            System.out.println(key);
            System.out.println("Cevabi giriniz: ");
            String cevap = scanner.nextLine();
            if (cevap.equalsIgnoreCase(val)) {
                dogruCevapSayisi += 1;
                System.out.println("Dogru bildiniz!");
            } else {
                System.out.println("Yanlis cevap");
            }
        }
        System.out.println("Toplam bilinen soru sayisi: " + dogruCevapSayisi);
    }
}
