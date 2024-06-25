package com.blessing.threads.forkjoin;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class RecursiveTaskDemo2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8);

        ForkJoinPool fjp = new ForkJoinPool();
        DoubleNumbersRecursiveAction dn = new DoubleNumbersRecursiveAction(list);
        Integer sum = fjp.invoke(dn);
        System.out.println(sum);
    }


    @SuppressWarnings("serial")
    static class DoubleNumbersRecursiveAction extends RecursiveTask<Integer> {

        private final List<Integer> list;

        public DoubleNumbersRecursiveAction(List<Integer> list) {
            this.list = list;
        }

        @Override
        protected Integer compute() {
            if (list.size() <= 2) {
                return list.stream().mapToInt(x -> x).sum();
            } else {
                int mid = list.size() / 2;
                List<Integer> list1 = list.subList(0, mid);
                List<Integer> list2 = list.subList(mid, list.size());

                DoubleNumbersRecursiveAction t1 = new DoubleNumbersRecursiveAction(list1);
                DoubleNumbersRecursiveAction t2 = new DoubleNumbersRecursiveAction(list2);

                t2.fork();

                return t1.compute() + t2.join();

                /**
                 * return t2.join() + t1.compute();
                 * not efficient because join() blocks current thread
                 * which means t1.compute() will also not be executed in parallel with the current thread
                 *
                 * But
                 * return t1.compute() + t2.join();
                 * allows t1.compute() to use current thread without waiting, which allows t1 to
                 * execute in parallel with t2.join
                 */
            }
        }
    }
}
