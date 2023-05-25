package com.atamertc.aksam.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueAksam {
    public static void main(String[] args) {

        Queue<Integer> kuyruk = new LinkedList<>();
        kuyruk.add(1);
        kuyruk.offer(3);
        kuyruk.offer(5);
        kuyruk.offer(9);

        System.out.println(kuyruk.peek());

        while (!kuyruk.isEmpty()) {
            System.out.println(kuyruk.poll());
        }
        System.out.println(kuyruk.peek());
        System.out.println(kuyruk.size());


    }
}
