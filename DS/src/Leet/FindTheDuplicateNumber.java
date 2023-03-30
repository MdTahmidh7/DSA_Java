package Leet;

//  https://leetcode.com/problems/find-the-duplicate-number/
// Amazom
public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        int [] array = {1,2,4,4};
        int result = findDisappearedNumbers(array);
        System.out.println(result);

    }
    public int findDuplicate(int[] nums) {
        int duplicateNumber=-1;
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
                    duplicateNumber = nums[j];
                }

            }
        }
        return duplicateNumber;
    }



    public static int findDisappearedNumbers(int[] nums) {
        int duplicateNumber=-1;
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
                    duplicateNumber = nums[j];
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
