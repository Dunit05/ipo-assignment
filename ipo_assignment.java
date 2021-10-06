package ipo;
// Name: Tommy

// Date: 2021-09-30
// Purpose: The purpose of the program is to solve three math problems. Two problems will be based on user input, the third will use randomly generated numbers as values from user input range. (Questions: Solving a quadratic equation using the quadratic formula, Calculating the distance between two points given their x and y coordinates, Calculating the slope of a line given two points on the line.)

import java.text.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

class Main {
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_RESET = "\u001B[0m";

    public static void main(String[] args) throws InterruptedException {
        // create master scanner class
        Scanner input = new Scanner(System.in);
        // create master format class
        DecimalFormat value = new DecimalFormat("#.##");

        // declare variable
        double a = 0;
        double b = 0;
        double c = 0;
        double top = 0;
        double x1 = 1;
        double x2 = 1;
        double y1 = 2;
        double y2 = 5;
        double d = 0;
        double slope = 0;
        int range = 0;

        // output welcome message to user
        System.out.print(
                "Welcome to the Math calculator, today we solving the following questions: \n\n1. Solving a quadratic equation using the quadratic formula \n2. Calculating the distance between two points given their x and y coordinates \n3. Calculating the slope of a line given two points on the line \n"
                        + TEXT_RED + "--------------------------------------------------------" + TEXT_RESET
                        + "\nWe are now going to solve a quadratic equation below" + "\nWait...\n");
        // pause for 4000ms
        Thread.sleep(6000);

        // Solving a quadratic equation using the quadratic formula
        // get a, b, c inputs
        System.out.print("Enter the \'A\' coefficient to calculate in a quadratic formula (negitives included): ");
        a = input.nextDouble();
        System.out.print("Enter the \'B\' coefficient to calculate in a quadratic formula (negitives included): ");
        b = input.nextDouble();
        System.out.print("Enter the \'C\' coefficient to calculate in a quadratic formula (negitives included): ");
        c = input.nextDouble();
        // pause for 4000ms
        Thread.sleep(4000);

        // caculations
        top = b * b - 4.0 * a * c;
        x1 = (-b + Math.pow(top, 0.5)) / (2.0 * a);
        x2 = (-b - Math.pow(top, 0.5)) / (2.0 * a);

        // output the two final value
        System.out.println("The two roots are x equals " + value.format(x1) + " and x equals " + value.format(x2));
        System.out.println(TEXT_RED + "--------------------------------------------------------" + TEXT_RESET);
        System.out.println("We are now going to solve the distance between two given coordinates\n");
        // pause for 4000ms
        Thread.sleep(4000);

        // Calculating the distance between two points given their x and y coordinates.
        // get (x1, y1) and (x2, y2) values
        System.out.print("Enter the x1 coordinate value (negitives included): ");
        x1 = input.nextDouble();
        System.out.print("Enter the y1 coordinate value (negitives included): ");
        y1 = input.nextDouble();
        System.out.print("Enter the x2 coordinate value (negitives included): ");
        x2 = input.nextDouble();
        System.out.print("Enter the y2 coordinate value (negitives included): ");
        y2 = input.nextDouble();

        // pause for 4000ms
        Thread.sleep(4000);

        // caculations
        a = (y2 - y1);
        b = (x2 - x1);
        a = Math.pow(a, 2);
        b = Math.pow(b, 2);
        d = Math.sqrt(a + b);

        // output distance between the points
        System.out.println("The distance between the two points are " + value.format(d));
        System.out.println(TEXT_RED + "--------------------------------------------------------" + TEXT_RESET);
        System.out.println("We are now going to solve the slope of a line with randomly chosen values\n");
        // pause for 4000ms
        Thread.sleep(4000);

        // Calculating the slope of a line given two points on the line

        System.out.println("The computer will randomly generate an x and y value, choose a value below. ");
        // ask for user input for range of randomly chosen values
        System.out.print("1. 0-20, 2. 20-40, 3. 40-60 : ");
        range = input.nextInt();

        // if statement to generate a value based on user input range
        if (range == 1) {
            x1 = (int) (20 * Math.random() + 1);
            x2 = (int) (20 * Math.random() + 1);
            y1 = (int) (20 * Math.random() + 1);
            y2 = (int) (20 * Math.random() + 1);
            Thread.sleep(4000);
            System.out.print(
                    "\nThe random generated values are (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") Wait...");
        } else if (range == 2) {
            x1 = (int) (20 * Math.random() + 21);
            x2 = (int) (20 * Math.random() + 21);
            y1 = (int) (20 * Math.random() + 21);
            y2 = (int) (20 * Math.random() + 21);
            Thread.sleep(4000);
            System.out.print(
                    "\nThe random generated values are (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") Wait...");
        } else if (range == 3) {
            x1 = (int) (20 * Math.random() + 41);
            x2 = (int) (20 * Math.random() + 41);
            y1 = (int) (20 * Math.random() + 41);
            y2 = (int) (20 * Math.random() + 41);
            Thread.sleep(4000);
            System.out.print(
                    "\nThe random generated values are (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") Wait...");
        } else {
            x1 = (int) (20 * Math.random() + 1);
            x2 = (int) (20 * Math.random() + 1);
            y1 = (int) (20 * Math.random() + 1);
            y2 = (int) (20 * Math.random() + 1);
            Thread.sleep(4000);
            System.out.print(
                    "\nThe random generated values are (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") Wait...");
        }

        // pause for 4000ms
        Thread.sleep(4000);
        // caculations
        x1 = x2 - x1;
        y1 = y2 - y1;

        slope = (y1 / x1);
        // output the slope
        System.out.println("\nThe slope of this line is " + value.format(slope));
        System.out.println(TEXT_RED + "----------------------" + TEXT_RESET);
        System.out.println("Thank you for using the math caculator!");

        // close scanner class
        input.close();

    } // close main method
} // close class
