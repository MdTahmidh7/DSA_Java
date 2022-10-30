package Searching;

public class Wealth {
    public static void main(String[] args) {
        int [][] account= {
                {1,2,3,10},
                {1,2},
                {1,2,3,4}
        };
        System.out.println(maximumWealth(account));
    }
    public static int maximumWealth(int[][] accounts) {
        int max=0;
        for (int i = 0; i < accounts.length; i++) {
            int wealth=0;
            for (int j = 0; j <accounts[i].length ; j++) {
                wealth = wealth+accounts[i][j];
            }
            if (wealth>max){
                max=wealth;
            }
        }
        return max;
    }
}
