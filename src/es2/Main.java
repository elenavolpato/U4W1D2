package es2;

//Exercise #2 – switch
//Write a program that asks for an integer as input and prints it in letters if the value is between 0 and 3, otherwise prints an error message using the switch construct.

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number from 0 to 3: ");
        int number = scanner.nextInt();

        switch(number) {
            case 0 -> System.out.println("Zero");
            case 1 -> System.out.println("Uno");
            case 2 -> System.out.println("Due");
            case 3 -> System.out.println("Tre");
            default -> System.out.println("Number out of range");

        }
    }
}
