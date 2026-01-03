package dev.lpa;

import java.util.Arrays;

public class ImplementMinFinder {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
        System.out.println(Arrays.toString(revArr(arr)));
    }

    private static int[] revArr(int[] arr)
    {
        System.out.println(Arrays.toString(arr));
        int len = arr.length - 1;
        int temp, i = 0;
        int iterations = arr.length / 2;
        while (iterations != 0) {
            temp = arr[i];
            arr[i] = arr[len];
            arr[len] = temp;
            i++;
            len--;
            iterations--;
        }
        return arr;
    }
}
