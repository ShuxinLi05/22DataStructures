package com.company;

import java.util.*;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(new ArrayList<>(), new boolean[nums.length], result, nums);
        return result;
    }

    private static void dfs(List<Integer> list, boolean[] used, List<List<Integer>> result, int[] letters) {
        if (list.size() == used.length) {
            result.add(new ArrayList<Integer>(list));
            return;
        }

        for (int i = 0; i < used.length; i++) {
            if (used[i]) continue;

            list.add(letters[i]);
            used[i] = true;
            dfs(list, used, result, letters);
            list.remove(list.size() - 1);
            used[i] = false;
        }
    }
}
