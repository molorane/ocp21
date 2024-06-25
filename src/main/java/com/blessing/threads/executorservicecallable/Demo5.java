package com.blessing.threads.executorservicecallable;

import java.util.concurrent.*;

public class Demo5 {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // TODO Auto-generated method stub

        ExecutorService service = Executors.newFixedThreadPool(4);

        Callable<String> c = () -> "Nomfundo";

        Future<? extends String> future = service.submit(c);

        String o = future.get();
        System.out.println(o);

        Runtime.getRuntime().availableProcessors();

        service.shutdown();
    }

}
