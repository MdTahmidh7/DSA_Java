package Searching;

import java.util.ArrayList;
import java.util.Collections;

public class LargetSubArray {
    public static void main(String[] args) {
        int array[] = {7,2,5,10,8};

        int length = array.length;
//        for (int i = 0; i < length; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                int temp = 0;
//                if (array[j] < array[i]) {
//                    temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                }
//            }
//        }

        ArrayList result = new ArrayList<>();

        max(array,length,result);


    }
    public static  void max(int [] array, int length, ArrayList result){
        for (int i = 1; i < length; i++) {
            int x = length - i;
            int y = length - x;
            int[] array1 = new int[x];
            int[] array2 = new int[y];
            int sum1 = 0;
            int sum2 = 0;
            System.out.println(x + " " + y);
            for (int j = 0; j < length; j++) {
                if (j < x) {
                    sum1 = sum1 + array[j];
                } else {
                    sum2 = sum2 + array[j];
                }
            }
            System.out.println("Sum1 = " + sum1);
            System.out.println("Sum2 = " + sum2);
            if (sum1 > sum2){
                result.add(sum1);
            }else{
                result.add(sum2);
            }
        }


        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n"+result);
        System.out.println("Max is = "+ Collections.max(result));
    }
}




