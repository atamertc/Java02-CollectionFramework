package com.atamertc.aksam.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/*
bu iki array uzerinden bir map yapip disaridan girilen kelimede
turkce karakter varsa ingilizce karaktere cevirsin
 */
public class KarakterDegistirme {

    char[] turkishWords = { 'İ', 'ı', 'ş', 'Ş', 'ç', 'Ç', 'ğ', 'Ğ', 'ü', 'Ü', 'ö', 'Ö' };
    char[] englishWords = { 'I', 'i', 's', 'S', 'c', 'C', 'g', 'G', 'u', 'U', 'o', 'O' };
    Map<Character, Character> map = new LinkedHashMap<>();
    public void mapOlustur() {

        for (int i = 0; i < turkishWords.length; i++) {
            map.put(turkishWords[i], englishWords[i]);
        }
    }

    public void degistir() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kelime gir: ");
        String kelime = scanner.nextLine();

        for (char c : kelime.toCharArray()) {
            if (map.containsKey(c)) {
                kelime = kelime.replace(c, map.get(c));
            }
        }
        System.out.println("Yeni kelime: " + kelime);
    }


    public static void main(String[] args) {

        KarakterDegistirme karakterDegistirme = new KarakterDegistirme();
        karakterDegistirme.mapOlustur();
        karakterDegistirme.degistir();





    }
}
