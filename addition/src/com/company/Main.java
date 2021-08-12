package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        // program to add two user-defined numbers
        System.out.println("Enter two numbers:");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if (num1 > num2)
        {System.out.println(num1);}
        else
            {System.out.println(num2);}

        int sum = num1+num2;   //for input like name it is println("Name: +name+") *include the plus signs
        System.out.println("The sum is:" +sum);
    }
}
