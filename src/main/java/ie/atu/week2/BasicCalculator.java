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
        scan1.close();

        System.out.println(firstNumber + " + " + secondNumber + " = " + add(firstNumber, secondNumber));
        System.out.println(firstNumber + " - " + secondNumber + " = " + sub(firstNumber, secondNumber));
        System.out.println(firstNumber + " * " + secondNumber + " = " + mul(firstNumber, secondNumber));
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
}