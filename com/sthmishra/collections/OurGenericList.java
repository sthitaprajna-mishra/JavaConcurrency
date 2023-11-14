package com.sthmishra.collections;

import java.util.Iterator;

public class OurGenericList<T> implements Iterable<T> {
    private T[] items;
    private int size;

    public OurGenericList() {
        size = 0;
        items = (T[])new Object[100];
    }

    public void add(T item) {
        items[size++] = item;
    }

    public T getItemAtIndex(int index) {
        return items[index];
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
