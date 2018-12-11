package com.codegym;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        Square square1 = new Square(10.0);
        System.out.println(square1);

        Square square2 = new Square("gray", false, 25.9);
        System.out.println(square2);
    }
}
