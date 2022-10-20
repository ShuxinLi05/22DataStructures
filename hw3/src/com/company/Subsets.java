package com.company;
import java.util.*;
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        search(list, nums, 0, new ArrayList<>(), nums.length);
        return list;
    }

    private void search(List<List<Integer>> list, int[] nums, int i, List<Integer> tempList, int n) {
        if (i >= n) {
            list.add(new ArrayList<>(tempList));
            return;
        }

        tempList.add(nums[i]);
        search(list, nums, i + 1, tempList, n);

        tempList.remove(tempList.size() - 1);
        search(list, nums, i + 1, tempList, n);

        return;
    }
}
