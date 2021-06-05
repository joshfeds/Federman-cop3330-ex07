package oop.Exercise07;
import java.util.Scanner;
import java.math.BigDecimal;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Federman
 */
public class Exercise07
{
    static Scanner input = new Scanner(System.in);
    static final double METER_CONVERSION = 0.09290304;
    public static int getLength() {
        System.out.print("What is the length of the room in feet? ");
        return input.nextInt();
    }
    public static int getWidth() {
        System.out.print("What is the width of the room in feet? ");
        return input.nextInt();
    }
    public static void getAreaSquare(int length, int width) {
        System.out.println("You entered dimensions of " + length + " feet by " + width + " feet.");
        int area = length * width;
        System.out.println("The area is\n" + area + " square feet");

        double meter = area * METER_CONVERSION;
        System.out.print(meter + " square meters");
    }
    public static void main( String[] args ) {
        int length = getLength();
        int width = getLength();
        getAreaSquare(length, width);
    }
}
