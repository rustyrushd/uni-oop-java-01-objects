/*
 * This class is a simple calculator that reads two numbers and a choice of operation from the user. It then prints the
 * result. The operations are addition, subtraction, multiplication and division. Simple but incomplete error correction
 * is included.
 *
 * Author: rgm
 *
 * [1.0.1] - 2025-10-15
 */

package ie.atu.week2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BasicCalculator
{
    public static void main(String[] args)
    {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        try {
            double firstNumber = scan1.nextDouble();
            System.out.println("You entered " + firstNumber + "\n");

            System.out.println("Would you like to add (enter \"+\"), subtract (enter \"-\"), multiply (enter \"*\") " +
                    "or divide (enter \"/\") these two numbers?");
            String choice = scan1.next();

            System.out.println("Please enter the second number: ");
            double secondNumber = scan1.nextDouble();
            System.out.println("You entered " + secondNumber + "\n");

            scan1.close();
            operation(choice, firstNumber, secondNumber);
        } catch (InputMismatchException e) {
            System.err.println("Invalid input, please try again with a valid number like 1, 2, 3...\uD83E\uDEE0");
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("\nThanks for using, have a nice day!");
    }

    // selects operation for two passed numbers and prints result
    static void operation (String choice, double firstNum, double secNum)
    {
        String result = switch (choice) {
            case "+" -> Double.toString(add(firstNum, secNum));
            case "-" -> Double.toString(sub(firstNum, secNum));
            case "*" -> Double.toString(mul(firstNum, secNum));
            case "/" -> {
                if (secNum == 0) {
                    throw new ArithmeticException("Division by zero: To infinity and beyond, " +
                            "as the second number = 0! " + "\uD83D\uDE80");
                } else {
                    yield  Double.toString(div(firstNum, secNum));
                }
            }
            default -> {
              result = "\uD83E\uDD37???";
              System.err.println("Your expression:\n" + firstNum + " " + choice + " " + secNum + " = " + result);
              throw new IllegalArgumentException("Invalid operation selected, please type \"+\" to add, \"-\" to subtract, \"*\" " +
                        "to multiply or \"/\" to divide next time.");
            }
        };
        System.out.println("\n" + firstNum + " " + choice + " " + secNum + " = " + result);
    }

    // add two numbers
    static double add(double firstNum, double secondNum)
    {
        return firstNum + secondNum;
    }

    // subtract two numbers
    static double sub(double firstNum, double secondNum)
    {
        return firstNum - secondNum;
    }

    // multiply two numbers
    static double mul(double firstNum, double secondNum)
    {
        return firstNum * secondNum;
    }

    // divide two numbers
    static double div(double firstNum, double secondNum)
    {
        return firstNum / secondNum;
    }
}