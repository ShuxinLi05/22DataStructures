package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    // arr = [0,0,0,0,0,1,1,1,1,2,2,5,5,5,8,9,10,11]
    // values = [1,4,5,10]
    // output = [5, -1, 12, 17]

    private static int[] getStartOfEachValues(int[] arr, int[] values) {
        int[] indexes = new int[values.length];

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.putIfAbsent(arr[i], i);
        }

        for (int i = 0; i < values.length; i++) {
            indexes[i] = map.getOrDefault(values[i], -1);
        }

        return indexes;
    }

}
