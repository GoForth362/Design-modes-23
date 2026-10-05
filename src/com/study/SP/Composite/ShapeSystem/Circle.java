package com.study.SP.Composite.ShapeSystem;

public class Circle implements Shape {
    private int x, y;
    private final int radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "Circle at (" + x + ", " + y + ")");
    }
}
