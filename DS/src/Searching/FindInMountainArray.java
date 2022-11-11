package Searching;

public class FindInMountainArray {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,3,2,1};
        System.out.println(peakIndexInMountainArray(array,11));
    }
    public static int peakIndexInMountainArray(int[] nums, int target) {
        int start =0;
        int end = nums.length-1;
        while(start<end){
            int mid = start + (end-start)/2 ;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                end = mid;
            }else if(nums[mid]<target){
                start = mid +1;
            }
        }
        if(nums[start]== target){
            return start;
        }else return -1;
    }
}
