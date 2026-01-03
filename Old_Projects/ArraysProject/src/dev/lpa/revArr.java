package dev.lpa;

import java.util.Arrays;

public class revArr {
    public static void main(String[] args) {
        int[] arr = {15,42,38,-2,0};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
    }

    private static void reverse(int[] array)
    {
        int iter = array.length / 2;
        int rev = array.length - 1;
        for(int i = 0; i < iter; i++)
        {
            int temp = array[i];
            array[i] = array[rev];
            array[rev--] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
