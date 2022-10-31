package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,90};
        System.out.println(binarySearch(array,5));
    }
    public static  int binarySearch(int [] array, int target){
        int start = 0;
        int end = array.length-1;

       while (start <= end){
           int mid = start + (end-start)/2 ;
           if(target < array[mid]){
               end = mid-1;
           } else if (target > array[mid]) {
               start = mid+1;
           }else {
               return  array[mid];
           }
       }
        return -1;
    }
}