package com.blessing.hackerrank;

import java.util.List;

public class CountElementsGreatorThanPreviousEverage {

    public static int countResponseTimeRegressions(List<Integer> responseTimes) {
        // Write your code here

        if(responseTimes.isEmpty()) return 0;
        if(responseTimes.size() == 1) return 0;

        int count = 0;

        for(int i=1; i<responseTimes.size(); i++) {
            int sum = 0;
            for(int j = 0; j < i; j++) {
                sum += responseTimes.get(j);
            }

            int average = sum/i;

            if(responseTimes.get(i) > average) count++;
        }

        return count;
    }

    public static int countResponseTimeRegressions2(List<Integer> times) {
        if (times.size() <= 1) return 0;

        int count = 0;
        long prefixSum = times.get(0);

        for (int i = 1; i < times.size(); i++) {
            double avg = prefixSum / (double) i;

            if (times.get(i) > avg) {
                count++;
            }

            prefixSum += times.get(i);
        }

        return count;
    }


    public static void main(String[] args) {
        System.out.println(List.of("LOve", "pi"));
    }

    public static int countAffordablePairs(List<Integer> prices, int budget) {
        // Write your code here
        if(prices.isEmpty() || prices.size() == 1) return 0;
        int count = 0;

        for(int i=0;i<prices.size();i++) {
            for(int j=i+1;j<prices.size();j++) {
                if(i != j && prices.get(i) + prices.get(j) <= budget) {
                    count++;
                    System.out.println("["+ prices.get(i) + "," + prices.get(j) + "]");
                }
            }
        }

        return count;

    }

}
