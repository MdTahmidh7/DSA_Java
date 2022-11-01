package Searching;

public class Celing {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,14,16,18, 90};
        System.out.println(celing(array,15));
    }
    public static  int celing(int [] array, int target){
        // if target is the bigger than the greatest number
        if(target > array[array.length-1]){
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
        return array[start];
    }
}
