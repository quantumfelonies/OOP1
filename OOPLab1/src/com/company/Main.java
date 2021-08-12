package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kcsegrade;
        int intscore;
        int conflvl;

        System.out.print( "Input KCSE grade: " );
        kcsegrade = input.nextInt();

        System.out.print( "Input interview questions score: " );
        intscore = input.nextInt();

        System.out.print( "Input confidence level score: " );
        conflvl = input.nextInt();

        if(kcsegrade >= 65) {
            if (intscore >= 6 || conflvl >= 5) {
                System.out.println("Admission approved");
            } else {
                System.out.println("Admission rejected");
            }
        }
        else{
            System.out.println("Admission rejected");
        }
    }
}
