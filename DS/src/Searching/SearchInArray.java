package Searching;

public class SearchInArray {
    public static void main(String[] args) {
        int array [][] = {
                {1,2,3},
                {11,22,33,44},
                {10}
        };
        int target = 10;
        search(array,target);
    }
    public static void search(int [][] array, int target){
        if(array.length==0){
            System.out.println("Array is null");
        }else{
            for (int i = 0; i < array.length ; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j]);
                    if (array[i][j]==target){
                        System.out.println("Value found");
                    }else{
                        System.out.println("Result not found");
                    }
                }
                System.out.println(" ");
            }
        }
    }
}
