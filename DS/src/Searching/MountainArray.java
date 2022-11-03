package Searching;

public class MountainArray {
    public static void main(String[] args) {
       // int[] array = {1, 2, 3,4,5,6, 1};
        int[] array = {4,10,1,0};
        System.out.println(peakIndexInMountainArray(array));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int max = arr[(arr.length - 1) / 2];
        int start = (arr.length - 1) / 2;
        int temp = 1, temp1 = 1;
        for (int i = start; temp > 0 && temp1 > 0; ) {
            if (max - arr[i - 1] > 0 & max - arr[i + 1] > 0) {
                return max;
            } else if (arr[start - 1] > max) {
                if (max - arr[i-1] >= 0) {
                    temp = -1;
                }
                max = arr[i - 1];
                i--;
            } else if (max < arr[i + 1]) {
                if (max - arr[i+1] >= 0) {
                    temp1 = -1;
                }
                max = arr[i + 1];
                i++;
            }
        }
        return max;
    }
}
