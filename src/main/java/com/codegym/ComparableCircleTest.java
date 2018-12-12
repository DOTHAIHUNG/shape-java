package com.codegym;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        CompareableCircle[] compareableCircles = new CompareableCircle[3];
        compareableCircles[0] = new CompareableCircle();
        compareableCircles[1] = new CompareableCircle(25.9);
        compareableCircles[2] = new CompareableCircle("red", true, 9.25);

        System.out.println("Pre-sorted:");
        for (CompareableCircle compareableCircle : compareableCircles) {
            System.out.println(compareableCircle);
        }

        Arrays.sort(compareableCircles);

        System.out.println("After-sorted:");
        for (CompareableCircle compareableCircle : compareableCircles) {
            System.out.println(compareableCircle);
        }
    }
}
