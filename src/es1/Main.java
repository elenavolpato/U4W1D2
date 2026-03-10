package es1;
import java.util.Scanner;

//Exercise #1 – if-else if
//Write the following methods:
//
//stringaPariDispari, which accepts a string and returns true if the number of characters is even and false if the number of characters is odd.
//annoBisestile, which accepts a year expressed as an integer and returns true if it is a leap year, false otherwise.
//[For a year to be a leap year it must follow these rules:
//be divisible by 4
//if divisible by 100, it must also be divisible by 400
//]
//Write a main that uses the methods.





public class Main{
    public static boolean stringaPariDispari(String s) {
        return s.length() % 2 == 0;
    }

    public static boolean annoBisestile(int anno) {
        if (anno % 4 == 0) {
            if (anno % 100 == 0) {
                return anno % 400 == 0;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (stringaPariDispari(input)) {
            System.out.println("The string has an EVEN number of characters (" + input.length() + ")");
        } else {
            System.out.println("The string has an ODD number of characters (" + input.length() + ")");
        }

        System.out.print("Enter a year: ");
        int anno = scanner.nextInt();

        if (annoBisestile(anno)) {
            System.out.println(anno + " è bisestile");
        } else {
            System.out.println(anno + " non è bisestile.");
        }
    }
}
