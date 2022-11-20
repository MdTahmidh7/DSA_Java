package Searching;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int [][] matrix ={
                {10,11,13,18},
                {20,22,24,28},
                {30,31,33,35},
                {50,55,56,60}
        };
        System.out.println(Arrays.toString(binarySearchIn2DArray(matrix, 600)));
    }
    public static int [] binarySearchIn2DArray(int [][] matrix, int target){
        int r =0;
        int c = matrix.length-1;
        while (r < matrix.length && c >=0){
             if(matrix[r][c] == target){
                 return new int[]{r,c};
             } else if (matrix[r][c] < target) {
                 r++;
             }else{
                 c--;
             }
        }
        return new int[]{-1,-1};
    }
}
