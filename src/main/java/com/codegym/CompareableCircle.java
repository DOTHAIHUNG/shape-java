package com.codegym;

public class CompareableCircle extends Circle implements Comparable<CompareableCircle> {
    public CompareableCircle() {
    }

    public CompareableCircle(double radius) {
        super(radius);
    }

    public CompareableCircle(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }

    @Override
    public int compareTo(CompareableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }
}
