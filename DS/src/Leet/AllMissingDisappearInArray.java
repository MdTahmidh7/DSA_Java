package Leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
// Asked in GOOGLE
class AllMissingDisappearInArray {

    public static void main(String[] args) {
       int [] nums = {4,3,2,7,8,2,3,1};
       List<Integer> result = findDisappearedNumbers(nums);
        //findDisappearedNumbers(nums);
       // System.out.println(Arrays.toString(nums));
        System.out.println(result);
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i =0;
        while (i < nums.length){
            int correctIndex = nums[i]-1;
            if(nums[i] != nums[correctIndex]){
                swap(nums,i,correctIndex);
            }
            else i++;
        }

//        Find missing number
        List<Integer> missingList = new ArrayList<>();
        for (int j = 0; j < nums.length ; j++) {
            if(nums[j] != j+1){
                missingList.add(j+1);
            }
        }
        return missingList;
    }
    private static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}