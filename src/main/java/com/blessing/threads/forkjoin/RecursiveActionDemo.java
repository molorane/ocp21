package com.blessing.threads.forkjoin;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class RecursiveActionDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        ForkJoinPool pool = new ForkJoinPool(); // creates threads equal number of processors / cores
        DoubleNumbersRecursiveAction dn = new DoubleNumbersRecursiveAction(list);
        pool.invoke(dn);
        pool.shutdown();
    }

    @SuppressWarnings("serial")
    static class DoubleNumbersRecursiveAction extends RecursiveAction {

        private final List<Integer> list;

        public DoubleNumbersRecursiveAction(List<Integer> list) {
            this.list = list;
        }

        @Override
        protected void compute() {
            // TODO Auto-generated method stub
            if (list.size() <= 2) {
                list.stream().map(n -> 2 + n).forEach(System.out::println);
            } else {
                int mid = list.size() / 2;
                List<Integer> list1 = list.subList(0, mid);
                List<Integer> list2 = list.subList(mid, list.size());

                DoubleNumbersRecursiveAction t1 = new DoubleNumbersRecursiveAction(list1);
                DoubleNumbersRecursiveAction t2 = new DoubleNumbersRecursiveAction(list2);

                invokeAll(t1, t2);
            }
        }

    }

}
