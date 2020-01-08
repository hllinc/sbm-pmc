package com.hllinc.sbmpmc.util.thread.blockingqueue;

import java.util.concurrent.BlockingQueue;

/**
 * 生产方
 *
 * @author hongliang5
 * @date 2020/1/8 9:26 上午
 **/
public class Producer implements Runnable {
    private BlockingQueue<String> queue = null;

    Producer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            queue.put("1");
            Thread.sleep(1000);
            queue.put("2");
            Thread.sleep(1000);
            queue.put("3");
        } catch (InterruptedException ignored) {

        }
    }
}
