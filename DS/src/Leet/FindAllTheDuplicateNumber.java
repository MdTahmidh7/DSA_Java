package Leet;
// https://leetcode.com/problems/find-all-duplicates-in-an-array/
// Amazon

import java.util.ArrayList;
import java.util.List;

public class FindAllTheDuplicateNumber {
    public static void main(String[] args) {
        int [] array = {1,2,4,4,2,1};
        List<Integer> result = findDuplicates(array);
        System.out.println(result);

    }

    public static List<Integer> findDuplicates(int[] nums) {
        int i =0;
        while (i < nums.length){
            int correctIndex = nums[i]-1;
            if(nums[i] != nums[correctIndex]){
                swap(nums,i,correctIndex);
            }
            else i++;
        }
        List<Integer> duplicateList = new ArrayList<>();
        for (int j = 0; j < nums.length ; j++) {
            if(nums[j] != j+1){
                if(nums[j]==nums[nums[j]-1]){
                    duplicateList.add(nums[j]);
                }

            }
        }
        return duplicateList;
    }

    private static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
