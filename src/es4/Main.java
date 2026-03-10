package es4;
import java.util.Scanner;

//Exercise #4 – for
//Write a program that manages a countdown for a rocket launch. The system receives the total number of seconds from the user. If the value entered is negative it must be converted to positive, while if it exceeds the safety limit of 20 seconds it must be forced to 20.
//Write a method that, given the number of seconds, returns a single string containing the entire countdown report (from the chosen number down to 1). Within this string, each second must be accompanied by a status message: even seconds show "[OK] Second X", while odd seconds show "[CHECK] Second X". Additionally, exactly at second 10, the extra line "--- SEPARAZIONE STADIO ---" must be inserted in the report.

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Secondi al lancio: ");
        int secondi = scanner.nextInt();
        // convert to positive
        if (secondi < 0) {
            secondi = -secondi;
        }
        // max 20
        if (secondi > 20) {
            secondi = 20;
        }

        String report = "";

        for(int i = secondi; i >= 1; i--) {
            if (i % 2 == 0) {
                report += "[OK] second" + i + "\n";
            } else {
                report += "[CHECK] second " + i + "\n";
            }
            if(i==10) {
                report += "---  SEPARAZIONE SU STADIO ---\n";
            }
        }
        report += "--- 🚀 IGNITION ---";
        System.out.println(report);
    }
}
