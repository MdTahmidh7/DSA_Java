package Searching;

public class PeekOFMountain {
    public static void main(String[] args) {
        int[] array = {1,4,1};
        System.out.println(peakIndexInMountainArray(array));
    }
        public static int peakIndexInMountainArray(int[] arr) {
            int start =0;
            int end = arr.length-1;
            while(start<end){
                int mid = start + (end-start)/2 ;
                if(arr[mid]>arr[mid+1]){
                    end = mid;
                }else if(arr[mid]<arr[mid+1]){
                    start = mid +1;
                }
            }
            return start;
    }
}
