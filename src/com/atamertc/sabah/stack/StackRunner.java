package com.atamertc.sabah.stack;

import java.util.Stack;

public class StackRunner {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        //eleman ekleme
        stack.push(2);
        stack.push(20);
        stack.push(200);

        //en ustteki elemana bakalim
        System.out.println(stack.peek());
        System.out.println("------------------------------");
        //en ustteki elemani cikaralim
        stack.pop();
        System.out.println("pop() -> " + stack.peek());
        System.out.println("------------------------------");
        //stack eleman sayisi
        System.out.println("eleman sayisi: " + stack.size());
        System.out.println(stack);
        System.out.println("------------------------------");
        stack.pop(); //20 cikardi
        System.out.println("bir eleman daha cikardik: " + stack.isEmpty());
        stack.pop(); //2 cikardi
        System.out.println("bir eleman daha cikardik: " + stack.isEmpty());
        System.out.println("------------------------------");
        System.out.println(parantezKontrol("(({()}))"));


    }

    public static boolean parantezKontrol(String girdi) {
        Stack<Character> stack1 = new Stack<>();
        boolean uygunMu = true;
        for (int i = 0; i < girdi.length(); i++) {
            char lastChar = girdi.charAt(i);
            //{ [ ( ile basliyorsa stack e ekle
            if (lastChar == '{' || lastChar == '[' || lastChar == '(') {
                stack1.push(lastChar);
            } else if (lastChar == '}' || lastChar == ']' || lastChar == ')') {
                if (stack1.isEmpty()) {
                    uygunMu = false;
                    break;
                }
                if ((stack1.peek() == '{' && lastChar == '}') || (stack1.peek() == '[' && lastChar == ']') || (stack1.peek() == '(' && lastChar == ')')) {
                    stack1.pop();
                }
            }
        }
        if (!stack1.isEmpty()) {
            uygunMu = false;
        }
        System.out.println("Stackte kalan elemanlar: " + stack1);
        return uygunMu;
    }
}
