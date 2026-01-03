package dev.lpa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class ArrListChallenge {

    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> groceries = new ArrayList<>();
        boolean isDone = false;
        menu();
        while(!isDone)
        {
            switch(s.nextInt())
            {
                case 0 ->
                {
                    System.out.println("Goodbye!");
                    isDone = true;
                }
                case 1 ->
                {
                    addItems(groceries);
                    menu();
                }
                case 2 ->
                {
                    removeItems(groceries);
                    menu();
                }
                default -> {
                    System.out.println("Please enter a valid value!");
                }
            }
            System.out.print("Here is your grocery list: ");
            for(var i : groceries)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    private static void removeItems(ArrayList<String> groceries)
    {

        boolean done = false;
        System.out.println("Here is the grocery list");
        for (int i = 0; i < groceries.size(); i++)
        {
            System.out.print((i + 1) + ". " + groceries.get(i) + ", ");
        }
        System.out.println("____");
        while(!done)
        {
            System.out.println("""
                            1. Delete a specific item
                            2. Delete everything
                            """);
            switch(s.nextInt())
            {
                case 1 ->
                {
                    if(groceries.isEmpty())
                    {
                        System.out.println("Your list is empty!");
                        done = true;
                        break;
                    }
                    System.out.println("Which item do you want to delete?");
                    int item = s.nextInt() - 1;
                    try{
                        groceries.remove(item);
                    } catch (RuntimeException e) {
                        System.out.println("Enter a valid value!");
                        continue;
                    }
                    done = true;

                }
                case 2 ->
                {
                    if(groceries.isEmpty())
                    {
                        System.out.println("Your list is empty!");
                        done = true;
                        break;
                    }
                    groceries.clear();
                    System.out.println("Your list has been emptied!");
                    done = true;
                }
                default ->
                {
                    System.out.println("Enter a valid value!");
                }
            }
        }
    }

    private static void addItems(ArrayList<String> groceries)
    {
        String val;
        System.out.println("How many items do you want to add?");
        int num = s.nextInt();
        s.nextLine();

        System.out.println("Which items do you want to add?");
        while (num > 0)
        {
            val = s.nextLine();

            if (groceries.contains(val))
            {
                System.out.println("Item is already in the list!");
            }
            else
            {
                groceries.add(val);
                num--;
            }
        }

        System.out.print("Here is your item list: ");
        groceries.sort(Comparator.naturalOrder());
        System.out.println();
    }

    private static void menu()
    {
        System.out.println(""" 
                    Available actions:
                    0 - to shutdown.
                    1 - to add item(s) to list (comma delimited list).
                    2 - to remove any items (comma delimited list).
                    Enter a number for which action you want to do:""");
    }
}
