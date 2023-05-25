package com.atamertc.sabah.linkedList;

import java.util.LinkedList;

public class RunnerLinkedList {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Ata");
        linkedList.add("Kemal");
        linkedList.add("Ali");
        linkedList.add("Mert");
        linkedList.add("Deniz");
        linkedList.add("Can");
        System.out.println(linkedList);
        System.out.println("------------------------------------------------");
        //Listenin basina ekleme
        linkedList.addFirst("Yar");
        System.out.println(linkedList);
        System.out.println("------------------------------------------------");
        //indis ile ekleme
        linkedList.add(2, "Name");
        System.out.println(linkedList);
        System.out.println("------------------------------------------------");
        //offer: sona eleman ekler
        linkedList.offer("WW");
        System.out.println(linkedList);
        System.out.println("------------------------------------------------");
        //poll() listenin basindan eleman siler
        linkedList.poll();
        System.out.println(linkedList);
        System.out.println("------------------------------------------------");
        //pollLast() listenin sonuna eleman siler
        linkedList.pollLast();
        System.out.println(linkedList);
        System.out.println("------------------------------------------------");
        //peek() listenin basindaki elemani get ile almis olur
        System.out.println(linkedList.peek());
        System.out.println(linkedList.peekLast());
        System.out.println(linkedList);
        System.out.println("------------------------------------------------");
        //push() listenin basina ekler
        linkedList.push("TTT");
        System.out.println(linkedList);
        System.out.println("------------------------------------------------");
        //pop() listenin basindaki elemani siler
        linkedList.pop();
        System.out.println(linkedList);
        System.out.println("------------------------------------------------");


    }
}
