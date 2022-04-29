package com.bridgelabz.oops;

import java.util.Scanner;

public class LineComp {
    private static LineComp obj1;
    Scanner scanner = new Scanner(System.in);
    String LengthOfLine() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of co-ordinates x1, y1, x2, y2 :");
        int x1 = scanner.nextInt(), y1 = scanner.nextInt(), x2 = scanner.nextInt(), y2 = scanner.nextInt();
        String lengthOfLine = String.valueOf(Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)));
        System.out.println("Length of Line (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") is :" + lengthOfLine);
        System.out.println();
        return lengthOfLine;
    }
    // Prints true => equals, and Prints false => distinct
    void checkEqualityOfTwoLines() {
        String line1 = LengthOfLine();
        String line2 = LengthOfLine();
        System.out.println("---Equals Method---");
        System.out.println(line1.equals(line2));
    }
    void compareTwoLines() {
        String line1 = LengthOfLine();//S1 equal S2==returns 0
        String line2 = LengthOfLine();//S1 smaller s2 == positive value return
        System.out.println("---CompareTo Method---");//
        System.out.println(line1.compareTo(line2));
    }
    public static void main(String[] args) {
        LineComp.obj1 = new LineComp();
        obj1.checkEqualityOfTwoLines();
        obj1.compareTwoLines();
        obj1.LengthOfLine();
    }

}