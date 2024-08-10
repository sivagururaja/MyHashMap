package org.example;

import org.example.dto.Order;

public class Main {
    public static void main(String[] args) {

        // Key will be integer
        // Value will be an instance of Order class
        MyHashMap hashMap = new MyHashMap();

        hashMap.printAllKeyValuePairs();
        printEmptyLine();

        hashMap.put(1, null);
        hashMap.put(2, null);
        hashMap.put(3, null);
        hashMap.printAllKeyValuePairs();
        printEmptyLine();

        Order order = hashMap.get(1);
        hashMap.printOrder(order);
        printEmptyLine();

        Order oneMoreOrder = null;
        System.out.println(hashMap.containsValue(oneMoreOrder));
        printEmptyLine();
    }

    private static void printEmptyLine() {
        System.out.println("=================");
        System.out.println();
    }
}