package Searching;

public class SearchInRange {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,10,5,100,200,354,55,60,33,11,22};
        int length = array.length;
        int key = 2;
        boolean result = false;
        int position = -1;
        int startIndex = 0;
        int endIndex = length;
        for (int i = startIndex; i < endIndex; i++) {
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
