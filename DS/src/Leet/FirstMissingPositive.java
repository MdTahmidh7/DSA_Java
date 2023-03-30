package Leet;
// https://leetcode.com/problems/first-missing-positive/


public class FirstMissingPositive {

    public static void main(String[] args) {
        int [] nums = {1,2,0};
        int number = missingNumber(nums);
        System.out.println(number);
    }
    public static int missingNumber(int[] nums) {
        int i=0;
        while (i < nums.length){
            int correct = nums[i]-1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        };
        for (int index = 0; index <nums.length ; index++) {
            if(nums[index] != index+1){
                return index+1;
            }
        }
        return nums.length+1;
    }

    private static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
