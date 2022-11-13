package Searching;

public class RotationCount {
    public static void main(String[] args) {
        int arr [] = {6,7,8,9,1,2,3,4,5};
        System.out.println(rotationCount(arr));
    }

    private static int rotationCount(int [] array) {
        int pivot = findPivot(array);
        return pivot+1;
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
