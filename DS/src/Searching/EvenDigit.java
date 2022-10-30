package Searching;

public class EvenDigit {
    public static void main(String[] args) {
    int [] nums = {12,345,2,6,7896};
     //  System.out.println( findNumbers(nums));
        System.out.println( numberOfDigit(1221340));
    }
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    //Checking number of digit is odd or even
    private static boolean even(int num) {
        int result = numberOfDigit(num);
        return result%2 == 0;
    }
    //Count the number of digit
    public static int numberOfDigit(int num){
        if (num<0){
            num = num * (-1);
        }
        if(num==0){
            return 1;
        }
//        int count =0;
//        while(num>0){
//            count++;
//            num=num/10;
//        }
        return (int) Math.log10(num)+1;
    }
}
