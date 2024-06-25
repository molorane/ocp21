package com.blessing.threads.parallelstreams.reductions.performance;

import java.util.concurrent.ForkJoinPool;

public class Parallelism {
    public static void main(String[] args) {
        System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "8");
        System.out.println(ForkJoinPool.commonPool().getParallelism());
    }
}