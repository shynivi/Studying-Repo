package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class UsingArrays {
    public static void main(String[] args) {
//        int[] firstArray = getRandomArray(10);
//        System.out.println(Arrays.toString(firstArray));
//        Arrays.sort(firstArray);
//        System.out.println(Arrays.toString(firstArray));
//
//        int[] secondArray = new int[10];
//        System.out.println(Arrays.toString(secondArray));
//        Arrays.fill(secondArray, 5);
//        System.out.println(Arrays.toString(secondArray));
//
//        int[] thirdArray = getRandomArray(10);
//        System.out.println(Arrays.toString(thirdArray));
//
//        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
//        System.out.println(Arrays.toString(fourthArray));
//
//        Arrays.sort(fourthArray);
//        System.out.println(Arrays.toString(thirdArray));
//        System.out.println(Arrays.toString(fourthArray));
//
//        int[] smallArray = Arrays.copyOf(thirdArray, 5);
//        System.out.println(Arrays.toString(smallArray));
//
//        int[] lergerArray = Arrays.copyOf(thirdArray, 15);
//        System.out.println(Arrays.toString(lergerArray));
//
//        String[] sArray = {"Able", "jane", "Mark", "Ralph", "David"};
//        Arrays.sort(sArray);
//        System.out.println(Arrays.toString(sArray));
//        if(Arrays.binarySearch(sArray,"Mark") >= 0)
//        {
//            System.out.println("Found Mark in the list");
//        }
//
//        int[] s1 = {1,2,3,4,5};
//        int[] s2 = {1,2,3,4,5, 0};
//
//        if(Arrays.equals(s1,s2))
//        {
//            System.out.println("They are equal");
//        }else{
//            System.out.println("They aren't equal");
//        }
//
//
        int[] arr = getRandomArray(5);
        int[] rev = new int[5];
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int num = 4;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == arr[num])
            {
                rev[num] = arr[i];
            }
            rev[i] = arr[num--];
        }
        System.out.println(arr.length);
        System.out.println(Arrays.toString(rev));
    }

    private static int[] getRandomArray (int len){
        Random random = new Random();
        int[] newInt = new int[len];

        for(int i = 0; i < len; i++)
        {
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}
