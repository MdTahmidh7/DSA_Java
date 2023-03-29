package Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] array = {3,1,2,5,4,7,6};
        System.out.println("Before sorting = "+Arrays.toString(array));
        cyclicSort1(array);
        System.out.println("Before sorting = "+Arrays.toString(array));
    }
    public static void cyclicSort (int [] array){
        int pointer = 0;
        for (int i = 0; i < array.length ; i++) {
            int value = array[pointer];
            if(array[pointer] != i+1){
                int temp ;
                int val = array[pointer];
                temp = array[val-1];
                array[val-1] = array[pointer];
                array[pointer] = temp;
            }
            pointer++;

        }
    }
    public static void cyclicSort1(int [] array){
        int i =0;
        while (i < array.length){
            int correctIndex = array[i]-1;
            if(array[i] != array[correctIndex]){
                swap(array,i,correctIndex);
            }
            else i++;
        }
    }

    private static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
