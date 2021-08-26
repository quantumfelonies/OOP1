package com.company;

public class Main {

    public static void main(String[] args) {
        //years divisible by 14 and 20 between 1314 and 2014
        YearRange firstRange = new YearRange(1314,2014);
        firstRange.setRangeType(1);
        firstRange.setFirstDivisor(14);
        firstRange.setSecondDivisor(20);

        //leap years between 1100 and 3150
        YearRange secondRange = new YearRange(1100,3150);
        secondRange.setRangeType(2);
        secondRange.setFirstDivisor(4);
        secondRange.setSecondDivisor(400);

        //olympic years divisible by 3 between 1500 and 1890
        YearRange thirdRange = new YearRange(1500,1890);
        thirdRange.setRangeType(3);
        thirdRange.setFirstDivisor(3);
        thirdRange.setSecondDivisor(4);

        System.out.println("List of all years divisible by "+firstRange.getFirstDivisor() + " and " + firstRange.getSecondDivisor());
        firstRange.printYears();

        System.out.println("List of all leap years between " + secondRange.getFirstYear() + " and " + secondRange.getSecondYear());
        secondRange.printYears();

        System.out.println("List of all Olympic years between " + thirdRange.getFirstYear() + " and " + thirdRange.getSecondYear() + " that are divisible by " + thirdRange.getFirstDivisor());
        thirdRange.printYears();

    }
}