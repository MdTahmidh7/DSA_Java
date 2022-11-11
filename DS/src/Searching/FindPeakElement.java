package Searching;

public class FindPeakElement {
    public static void main(String[] args) {

    }
    public static int peakIndexInMountainArray(int[] nums) {
        int start =0;
        int end = nums.length-1;
        while(start<end){
            int mid = start + (end-start)/2 ;
            if(nums[mid]>nums[mid+1]){
                end = mid;
            }else if(nums[mid]<nums[mid+1]){
                start = mid +1;
            }
        }
        return nums[start];
    }
}
