package com.study.SP.Composite.ShapeSystem;

public class Main {
    public static void main(String[] args) {
        // 创建一个画布，它本身就是一个顶层组合
        Group canvas = new Group();

        // 创建另一个组合，并向其中添加形状
        Group subGroup = new Group();
        subGroup.add(new Square(100, 110, 40));
        subGroup.add(new Circle(200, 210, 25));

        // 将一个独立的形状和一个组合都添加到画布上
        canvas.add(new Circle(10, 20, 15));
        canvas.add(subGroup);

        System.out.println("--- Initial State ---");
        canvas.display("");
        // --- Initial State ---
        // Group {
        //   Circle at (10, 20)
        //   Group {
        //     Square at (100, 110)
        //     Circle at (200, 210)
        //   }
        // }

        // 移动整个画布，所有子元素都会被移动
        canvas.move(100, -50);
        System.out.println("\n--- After Moving (100, -50) ---");
        canvas.display("");
        // --- After Moving (100, -50) ---
        // Group {
        //   Circle at (110, -30)
        //   Group {
        //     Square at (200, 60)
        //     Circle at (300, 160)
        //   }
        // }
    }
}
