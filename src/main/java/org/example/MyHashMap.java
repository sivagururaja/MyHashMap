package org.example;

import org.example.dto.Order;

public class MyHashMap {

    private int initialCapacity;
    private float loadFactor;

    public MyHashMap() {
        this(16, 0.75f);

        initialize();
    }

    public MyHashMap(int initialCapacity, float loadFactor) {
        this.initialCapacity = initialCapacity;
        this.loadFactor = loadFactor;

        initialize();
    }

    /**
     * Can be used for initializing objects, if required
     */
    private void initialize() {}

    public void printAllKeyValuePairs() {
    }

    public Order put(Integer key, Order value) { return null; }

    public Order get(Integer key) { return null; }

    public boolean containsValue(Order value) { return Boolean.FALSE; }

    public void printOrder(Order order) {
    }
}
