package com.bridgelabz.oops;
import java.util.Scanner;
class A {
    String lengthOfLine() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of co-ordinates x1, y1, x2, y2 :");
        int x1 = scanner.nextInt(), y1 = scanner.nextInt(), x2 = scanner.nextInt(), y2 = scanner.nextInt();
        String lengthOfLine = String.valueOf(Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)));
        System.out.println("Length of Line (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") is :" + lengthOfLine);
        System.out.println();
        return lengthOfLine;
    }
}
class B extends A {
    void checkEqualityOfTwoLines() {
        String line1 = lengthOfLine();
        String line2 = lengthOfLine();
        System.out.println("---Equals Method---");
        System.out.println(line1.equals(line2));
    }
}
class C extends B {
    void compareTwoLines() {
        String line1 = lengthOfLine();
        String line2 = lengthOfLine();
        System.out.println("---CompareTo Method---");
        System.out.println(line1.compareTo(line2));
    }
}
class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        C obj1 = new C();
        obj1.compareTwoLines();
        obj1.lengthOfLine();
        obj1.checkEqualityOfTwoLines();
    }
}