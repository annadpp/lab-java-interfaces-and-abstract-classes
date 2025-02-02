package com.IntList;

public class IntArrayList implements IntList {
    private int[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public IntArrayList() {
        this.array = new int[DEFAULT_CAPACITY];
        this.size = 0;
    }

    //Methods overridden
    @Override
    public void add(int number) {
        if (size == array.length) {
            int[] newArray = new int[array.length * 3 / 2];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
        array[size++] = number;
    }

    @Override
    public int get(int id) {
        if (id < 0 || id >= size)
            throw new IndexOutOfBoundsException("Index: " + id + ", Size: " + size);
        return array[id];
    }
}