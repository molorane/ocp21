package com.blessing.threads.parallelstreams.reductions.performance;

import java.util.concurrent.ForkJoinPool;

public class Demo {

    public static void main(String[] args) {
        System.out.println("Number of processors: " + Runtime.getRuntime().availableProcessors());

        System.out.println("Default parallelism: " + ForkJoinPool.commonPool().getParallelism());
    }

}
