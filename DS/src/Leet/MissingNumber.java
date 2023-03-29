package Leet;
// https://leetcode.com/problems/missing-number/
// Asked in AMAZON
class MissingNumber {


    public static void main(String[] args) {
        int [] nums = {1,3,2,5,0};
        int number = missingNumber(nums);
        System.out.println(number);
    }
    public static int missingNumber(int[] nums) {
        int missingNumber=0;
        int i=0;
        while (i < nums.length){
            int correct = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        };
        for (int j = 0; j < nums.length ; j++) {
            if(j != nums[j]){
              missingNumber = j;
              break;
            }

        }
        return missingNumber;
    }

    private static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}