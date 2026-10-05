package com.study.SP.Composite.ShapeSystem;

import java.util.ArrayList;
import java.util.List;

public class Group implements Shape{
    private final List<Shape> children = new ArrayList<>();
    public void add(Shape shape) {
        children.add(shape);
    }

    @Override
    public void move(int dx, int dy) {
        // 当组合被移动时，它会遍历所有子形状，并依次移动它们
        for (Shape child : children) {
            child.move(dx, dy);
        }
    }

    @Override
    public void display(String indent) {
        // 显示组合自身的信息，并递归显示所有子形状的信息
        System.out.println(indent + "Group {");
        for (Shape child : children) {
            // 子形状增加缩进
            child.display(indent + "  ");
        }
        System.out.println(indent + "}");
    }
}
