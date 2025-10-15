/*
 * This class is a simple calculator that reads two numbers and a choice of operation from the user and prints the
 * result. The operations are addition, subtraction, multiplication and division. Simple but incomplete error correction
 * it present.
 *
 * Author: rgm
 *
 * [1.0.0] 2025-10-15
 */

package ie.atu.week2;

import java.util.Scanner;

public class BasicCalculator
{
    public static void main(String[] args)
    {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        double firstNumber = scan1.nextDouble();
        System.out.println("You entered " + firstNumber);

        System.out.println("Please enter the second number: ");
        double secondNumber = scan1.nextDouble();
        System.out.println("You entered " + secondNumber);

        System.out.println("Would you like to add (enter \"+\"), subtract (enter \"-\"), multiply (enter \"*\") " +
                "or divide (enter \"/\") these two numbers?");
        String operation = scan1.next();
        scan1.close();

        double result = 0;

        switch (operation) {
            case "+":
                result = add(firstNumber, secondNumber);
                break;
            case "-":
                result = sub(firstNumber, secondNumber);
                break;
            case "*":
                result = mul(firstNumber, secondNumber);
                break;
            case "/":
                if (secondNumber == 0) {
                    System.out.println("To infinity and beyond, as the second number = 0!");
                }
                else {
                    result = div(firstNumber, secondNumber);
                }
                break;
            default:
                System.out.println("Invalid operation selected, please type \"+\" to add, \"-\" to subtract, \"*\" " +
                        "to multiply or \"/\" to divide next time.");
        }
        System.out.println(firstNumber + " " + operation + " " + secondNumber + " = " + result);

        System.out.println("\nThanks for using, have a nice day!");
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