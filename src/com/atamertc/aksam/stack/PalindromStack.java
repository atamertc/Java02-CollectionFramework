package com.atamertc.aksam.stack;

import java.util.Scanner;
import java.util.Stack;

public class PalindromStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir kelime giriniz: ");
        String kelime = scanner.nextLine();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < kelime.length(); i++) {
            stack.push(kelime.charAt(i));
        }
        String palindrom = "";
        while (!stack.isEmpty()) {
            palindrom += stack.pop();
        }
        if (kelime.equals(palindrom)) {
            System.out.println(kelime + " bir palindromdur");
        } else {
            System.out.println(kelime + " palindrom degildir");
        }











    }
}
