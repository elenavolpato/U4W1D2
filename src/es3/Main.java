package es3;


//Exercise #3 – while
//Write a program that asks the user to enter a string and splits it into characters separated by a comma. The program repeats until the user enters the string ":q".

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while(!input.equals(":q")) {
            System.out.print("Enter a string (\":q\" to quit): ");
            input = scanner.nextLine();

            if (!input.equals(":q")) {
                String result = "";
                for (int i = 0; i < input.length(); i++) {
                    result += input.charAt(i);
                    if (i < input.length() - 1) {
                        result += ",";
                    }
                }
                System.out.println(result);
            }

        }
    }
}
