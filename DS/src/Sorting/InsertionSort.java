package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] array = {2,1,4,-1,7,6,3,0};

        for (int i = 1; i < array.length; i++) {
            int currentElement = array[i];
            //Making the place for the sorted element
            int j = i-1;
            while (j >=0 && currentElement < array[j]){
                array[j+1] = array[j];
                j--;
            }
            //Placement the current element
            array[j+1] = currentElement;
        }

        System.out.println(Arrays.toString(array));
    }
}
