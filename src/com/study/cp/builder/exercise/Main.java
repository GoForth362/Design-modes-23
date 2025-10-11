package com.study.cp.builder.exercise;

public class Main {
    public static void main(String[] args) {
        ComputerSet computer1 = new ComputerSet.Builder("core-i9","RTX4060").build();
        System.out.println(computer1.toString());

        ComputerSet computer2 = new ComputerSet.Builder("core-i9","RTX4060").Size(20).build();
        System.out.println(computer2.toString());
    }
}
