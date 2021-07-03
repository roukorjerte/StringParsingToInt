package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner strings = new Scanner(System.in);
        int sum = 0;

        System.out.println("enter first number");
        String firstNumber = strings.nextLine();

        System.out.println("enter second number");
        String secondNumber = strings.nextLine();

        sum = Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber);

        System.out.println( firstNumber + "+" + secondNumber + "=" + sum);

    }
}
