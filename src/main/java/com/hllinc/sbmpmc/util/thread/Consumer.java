package com.hllinc.sbmpmc.util.thread;

import java.util.concurrent.BlockingQueue;

/**
 * 消费方
 *
 * @author hongliang5
 * @date 2020/1/8 9:27 上午
 **/
public class Consumer implements Runnable {
    private BlockingQueue queue = null;

    Consumer(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            System.out.println(queue.take());
            System.out.println(queue.take());
            System.out.println(queue.take());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
