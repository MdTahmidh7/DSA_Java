package Searching;

public class MinimumValue {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,10,5,100,200,354,55,60,33,11,22,-1};
        int length = array.length;
        int minValue = 999;
        for (int i = 0; i < length; i++) {
            int temp = array[i];
            if(temp<minValue){
                minValue = temp;
            }
        }
        System.out.println("Minimum Value is = "+minValue);
    }
}
