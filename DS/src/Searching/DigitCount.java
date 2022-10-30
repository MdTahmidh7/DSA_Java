package Searching;

import java.util.Arrays;

public class DigitCount {
    public static void main(String[] args) {
        int [] array = {1,22,44,5555,666,100100};
        int[] resultArray = countDigit(array);
        System.out.println(Arrays.toString(resultArray));
    }
    public  static int[] countDigit(int [] array){
        int [] resultArray = new int[array.length];
        for (int i = 0; i < array.length ; i++) {
            resultArray[i] = (int) Math.log10(array[i])+1;
        }
        return resultArray;
    }
}
