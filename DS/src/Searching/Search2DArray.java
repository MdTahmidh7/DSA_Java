package Searching;

public class Search2DArray {
    public static void main(String[] args) {
        int [][] array ={
                {1,2,3,4},
                {11,22},
                {111,222,333}
        };
        boolean result = false;
        int target = 333;
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                if(target==array[i][j]){
                    result = true;
                    break;
                }
            }
        }
        if (result){
            System.out.println("Value found");
        }else{
            System.out.println("Value not found");
        }
    }
}
