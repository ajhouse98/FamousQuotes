package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {

        /**
         * Create 10 quotes
         * prompt user to select a number
         */

        String[] quotes = {"Work smarter not harder", "Keep it simple", "Never give up",
                "Be yourself", "There's always room at the top",
                "Never shy away from a challenge", "Rome wasn't built in a day",
                "Sometimes you win, sometimes you learn", "Fear doesn't stop death, it stops life",
                "The grass isn't always greener on the other side"
        };
        int index = 1;

        for (String s: quotes) {
            System.out.println( index++ + " " + s);
        }

        Scanner scanner = new Scanner(System.in);

        int numberofQuote;
        do {
            System.out.print("\n" + "Please select a quote by number: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid number.");
                System.out.print("Please select a quote by number: ");
                scanner.next();
            }
            numberofQuote = scanner.nextInt();
            scanner.nextLine();

            if (numberofQuote < 1 || numberofQuote > quotes.length) {
                System.out.println("\n" + "Invalid input. Please try again");
            }
        } while (numberofQuote < 1 || numberofQuote > quotes.length);

        System.out.println("\n" + quotes[numberofQuote - 1]);
    }
}