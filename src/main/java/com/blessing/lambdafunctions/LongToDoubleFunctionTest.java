package com.blessing.lambdafunctions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LongToDoubleFunctionTest {

    @SuppressWarnings({"unchecked", "rawtypes"})
    private static void checkPrices(List<Double> prices, Consumer scanner) {
        prices.forEach(scanner);
    }

    public static void main(String[] right) {
        List<Double> prices = Arrays.asList(1.2, 6.5, 3.0);
        checkPrices(prices, p -> {
            String result = (Double) p < 5 ? "Correct" : "Too high";
            System.out.println(result);
        });
    }

}
