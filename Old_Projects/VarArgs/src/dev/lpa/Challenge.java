package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        int[] arr = readIntegers();
        System.out.println(Arrays.toString(arr));
        System.out.println("Minimum number is: " + findMin(arr));
    }

    private static int[] readIntegers()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter list of ints");
        String val = s.nextLine();

        String[] splits = val.split(",");
        int[] iArr = new int[splits.length];

        for(int i = 0; i < splits.length; i++)
        {
            iArr[i] = Integer.parseInt(splits[i]);
        }
        return iArr;
    }
    private static int findMin(int[] arr)
    {
        Arrays.sort(arr);
        return arr[0];
    }
}
