package com.company;

import java.util.*;

public class NumWithSameConsecutiveDiff {
    List<Integer> result;
    public int[] numsSameConsecDiff(int n, int k) {
        result = new ArrayList<>();
        for(int i=1; i<=9; i++){
            search(i, 1, n, k);
        }
        int len = result.size();
        int[] arr = new int[len];
        for(int i=0; i<len; i++){
            arr[i] = result.get(i);
        }
        return arr;

    }

    public void search(int item, int index, int n, int k){
        if (index == n){
            result.add(item);
            return;
        }
        int a = item%10;

        if (k==0){
            int temp = (item*10)+a;
            search(temp, index+1,n,k);
        } else {
            if ((a+k)<=9){
                int temp = (item*10) +a+k;
                search(temp,index+1,n,k);
            }
            if ((a-k)>=0){
                int temp = (item*10) +a-k;
                search(temp,index+1,n,k);
            }
        }

    }

}
