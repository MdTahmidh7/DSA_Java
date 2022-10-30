package Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,10,5,100,200,354,55,60,33,11,22};
        int length = array.length;
        int key = 22;
        boolean result = false;
        int position = -1;
        for (int i = 0; i < length; i++) {
            int temp = array[i];
            if(key==temp){
               result=true;
               position = i;
                break;
            }
        }
        if(result){
            System.out.println("Value found at position = "+position);
        }else{
            System.out.println("Can not find value");
        }
    }
}
