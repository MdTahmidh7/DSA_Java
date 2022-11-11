package Searching;

public class RotedBinarySearch {
    public static void main(String[] args) {
        int [] array = {1,3};
        System.out.println(search(array,0));
    }
    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
      if (pivot == -1){
          return search(nums,0, nums.length-1,target );
      }
      else{
          if(nums[pivot]==target){
              return pivot;
          }else if(target >= nums[0]){
              return   search(nums,0,pivot-1,target);
          }else{
              return search(nums,pivot+1,nums.length-1,target);
          }
      }
    }
    private static int search(int []arr,int start, int end, int target) {
        while (start <= end){
            int mid = start + (end-start)/2 ;
            if(target < arr[mid]){
                end = mid-1;
            } else if (target > arr[mid]) {
                start = mid+1;
            }else {
                return  mid;
            }
        }
        return -1;
    }

    public static int findPivot(int [] arr){
        int start =0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end-start)/2 ;
            // now we have 4 case here
            if(mid < end && arr[mid]>arr[mid+1]){
                return mid;
            } else if (mid > start && arr[mid]<arr[mid-1]) {
                return mid-1;
            } else if (arr[start]<=arr[mid]) {
                start = mid+1;
            } else if (arr[start]>= arr[mid]) {
                end = mid-1;
            }
        }
        return -1;
    }
}
