package Searching;

public class BinarySearchInRange {

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(search(array,0,array.length-1,5));
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
}
