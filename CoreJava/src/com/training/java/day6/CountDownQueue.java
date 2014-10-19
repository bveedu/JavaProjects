package com.training.java.day6;

import java.util.*;

public class CountDownQueue {
    public static void main(String[] args)
            throws InterruptedException {
        int time = 10;
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = time; i >= 0; i--)
            queue.offer(i);
       /* while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }*/
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
    }
}
