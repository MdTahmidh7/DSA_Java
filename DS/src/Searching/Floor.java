package Searching;

public class Floor {
    public static void main(String[] args) {
        int [] array = {2,3,4,5,6,7,8,9,14,16,18, 90};
        System.out.println(floor(array,1));
    }
    public static  int floor(int [] array, int target){
        // if target is smaller than the smallest number
        if(target < array[0]){
            return -1;
        }
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
        return array[end];
    }
}
