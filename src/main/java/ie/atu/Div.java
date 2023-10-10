package ie.atu;

import java.util.Scanner;
public class Div {
    public static void main(String[] args) {
        divide();
    }
    public static void divide()
    {
        System.out.println("Please enter your first number :");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please enter your second number :");
        int secondNumber = inputs.nextInt();

        int total = firstNumber / secondNumber;
        System.out.println("Total is " + total);
    }
}