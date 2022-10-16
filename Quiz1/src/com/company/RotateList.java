package com.company;

import java.util.*;

public class RotateList {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        helperRotate(nums, 0, nums.length-1);
        helperRotate(nums, 0, k-1);
        helperRotate(nums, k, nums.length-1);
    }
    public void helperRotate(int[] nums, int left, int right){
        while(left < right){

            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}
