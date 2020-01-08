package com.hllinc.sbmpmc.util.thread.delayqueue;

import lombok.NonNull;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * @author hongliang5
 * @date 2020/1/8 6:26 下午
 **/
public class DelayedElement implements Delayed {
    long delayTime;
    long tamp;

    DelayedElement(long delay) {
        delayTime = delay;
        tamp = delay + System.currentTimeMillis();
    }

    @Override
    public long getDelay(@NonNull TimeUnit unit) {
        return tamp - System.currentTimeMillis();
//        return -1;
    }

    @Override
    public int compareTo(@NonNull Delayed o) {
        return tamp - ((DelayedElement) o).tamp > 0 ? 1 : -1;
    }
}
