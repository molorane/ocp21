package com.blessing.enthware.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

public class GroupingByDemo4 {

    static class Item {
        private String name;
        private String category;
        private double price;

        public Item(String name, String category, double price) {
            this.name = name;
            this.category = category;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return name;
        }

    }

    public static void main(String... ar) {
        List<Item> items = Arrays.asList(
                new Item("Pen", "Stationery", 3.0),
                new Item("Pencil", "Stationery", 2.0),
                new Item("Eraser", "Stationery", 1.0),
                new Item("Milk", "Food", 2.0),
                new Item("Eggs", "Food", 3.0));

        ToDoubleFunction<Item> priceF = Item::getPrice; //1

        Map<String, List<Item>> ma = items.stream()
                .collect(Collectors.groupingBy(Item::getCategory));

        System.err.println(ma);

        items.stream()
                .collect(Collectors.groupingBy(Item::getCategory)) //2
                .forEach((a, b) -> {
                    double av = b.stream().collect(Collectors.averagingDouble(priceF)); //3
                    System.out.println(a + " : " + av);
                });
    }

}
