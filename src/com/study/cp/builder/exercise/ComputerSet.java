package com.study.cp.builder.exercise;

import com.study.cp.builder.HttpRequest;

public final class ComputerSet {
    private final String CPU;
    private final String GPU;
    private final int Size;

    private ComputerSet(Builder builder){
        this.CPU = builder.CPU;
        this.GPU = builder.GPU;
        this.Size = builder.Size;
    }

    @Override
    public String toString() {
        return "ComputerSet{" +
                "CPU='" + CPU + '\'' +
                ", GPU='" + GPU + '\'' +
                ", Size=" + Size +
                '}';
    }

    public static class Builder {
        private final String CPU;
        private final String GPU;

        private int Size = 10;

        public Builder(String CPU, String GPU){
            this.CPU = CPU;
            this.GPU = GPU;
        }

        public Builder Size(int size){
            this.Size = size;
            return this;
        }

        public ComputerSet build(){
            return new ComputerSet(this);
        }
    }
}
