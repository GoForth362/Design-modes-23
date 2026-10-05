package com.study.SP.Composite.ShapeSystem;

public class Square implements Shape{
    private int x, y;
    private final int side;

    public Square(int x, int y, int side) {
        this.x = x;
        this.y = y;
        this.side = side;
    }

    @Override
    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "Square at (" + x + ", " + y + ")");
    }
}
