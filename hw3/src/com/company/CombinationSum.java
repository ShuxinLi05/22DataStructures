package com.company;

import java.util.*;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        getResult(result, new ArrayList<Integer>(), candidates, target, 0);

        return result;
    }

    private void getResult(List<List<Integer>> result, List<Integer> curr, int candidates[], int target, int start){
        if(target > 0){
            for(int i = start; i < candidates.length && target >= candidates[i]; i++){
                curr.add(candidates[i]);
                getResult(result, curr, candidates, target - candidates[i], i);
                curr.remove(curr.size() - 1);
            }
        }
        else if(target == 0 ){
            result.add(new ArrayList<Integer>(curr));
        }
    }
}
