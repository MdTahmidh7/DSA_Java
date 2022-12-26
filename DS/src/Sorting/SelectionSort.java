package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int array [] = {1,-10,2,100,99,20};
        selection(array);
        System.out.println(Arrays.toString(array));

    }
    public static void selection(int array[]){
        for (int i = 0; i < array.length-1 ; i++) {
            //find max Index
            int start = 0;
            int endIndex = array.length-i-1;
            int maxIndex = findMax(array,start,endIndex);
            //swap with last index
            swap(array,maxIndex,endIndex);
        }
    }

    private static void swap(int [] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    private static int findMax(int []array , int start,int end) {
        int max = start;
        for (int i = start; i <=end; i++) {
            if (array[max] < array[i]){
               max = i;
            }
        }
        return max;
    }
}
