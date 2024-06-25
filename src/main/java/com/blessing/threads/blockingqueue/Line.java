package com.blessing.threads.blockingqueue;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class Line {
    static BlockingDeque<Integer> queue = new LinkedBlockingDeque<>();

    public static void main(String[] participants) throws Exception {
		/*IntStream.iterate(1, i -> i + 1).limit(5).parallel()
				.forEach(s -> queue.offerLast(s, 10000, TimeUnit.MILLISECONDS));
		IntStream.iterate(1, i -> 5).limit(10).parallel().forEach(s -> queue.pollFirst(10, TimeUnit.SECONDS));
		System.out.print(queue.size());*/
    }
}