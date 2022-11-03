package Searching;

public class InfiniteSearch {
    public static void main(String[] args) {
        System.out.println(ans(new int[]{1, 2, 3, 4, 5, 6},1));
    }
    public static int ans(int []array, int target ){
        int start =0;
        int end =1;
        while(target> array[end]){
            int newStart = end+1;
            end = end + (end -start +1)*2;
            start = newStart;
        }
        return search(array,start,end,target);
    }

    private static int search(int []arr,int start, int end, int target) {
        while (start <= end){
            int mid = start + (end-start)/2 ;
            if(target < arr[mid]){
                end = mid-1;
            } else if (target > arr[mid]) {
                start = mid+1;
            }else {
                return  arr[mid];
            }
        }
        return -1;
    }
}
