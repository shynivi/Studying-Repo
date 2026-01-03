package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class SortIntArrayDesc {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter arr len:");
//        String val = s.nextLine();
//        int num = Integer.parseInt(val);
//        int arr[] = getIntegers(num);
//        printArray(arr);
//        arr = sortIntegers(arr);
//        System.out.println("__________");
//        printArray(arr);

        int[] arr = readElements(readInteger());
        System.out.println("____");
        System.out.println(findMin(arr));
    }

    private static int findMin(int[] arr)
    {
        Arrays.sort(arr);
        int num = arr.length - 1;
        int[] rev = new int[arr.length];
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == arr[num])
            {
                rev[num] = arr[i];
            }
            rev[i] = arr[num--];
        }
        return rev[0];
    }

    private static int readInteger()
    {
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

    private static int[] readElements(int num)
    {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[num];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static int[] getIntegers(int size)
    {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[size];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static void printArray(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println("Element " + i + " contents " + arr[i]);
        }
    }
}
