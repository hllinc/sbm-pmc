package com.hllinc.sbmpmc.util.thread.delayqueue;

import java.util.concurrent.DelayQueue;

/**
 * @author hongliang5
 * @date 2020/1/8 6:22 下午
 **/
public class DelayQueueExample {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        DelayedElement element1 = new DelayedElement(1000);
        DelayedElement element2 = new DelayedElement(0);
        DelayedElement element3 = new DelayedElement(400);
        queue.put(element1);
        queue.put(element2);
        queue.put(element3);
        DelayedElement e = queue.take();
        System.out.println("e1:" + e.delayTime);
        DelayedElement e2 = queue.take();
        System.out.println("e2:" + e2.delayTime);
        DelayedElement e3 = queue.take();
        System.out.println("e3:" + e3.delayTime);
    }
}
