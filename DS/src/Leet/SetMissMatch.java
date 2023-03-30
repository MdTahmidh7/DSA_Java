package Leet;

import java.util.Arrays;

// https://leetcode.com/problems/set-mismatch/
//
public class SetMissMatch {
    public static void main(String[] args) {
    int [] nums ={1,1};
    int [] result  = findErrorNums(nums);
        System.out.println(Arrays.toString(result));
    }
    public static int[] findErrorNums(int[] nums) {
        int [] duplicateNumber={-1,-1};
        int i =0;
        while (i < nums.length){
            int correctIndex = nums[i]-1;
            if(nums[i] != nums[correctIndex]){
                swap(nums,i,correctIndex);
            }
            else i++;
        }
        for (int j = 0; j < nums.length ; j++) {
            if(nums[j] != j+1){
                if(nums[j]==nums[nums[j]-1]){
                    duplicateNumber[0] = nums[j];
                    duplicateNumber[1] = j+1;
                }

            }
        }
        return duplicateNumber;
    }
    private static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
