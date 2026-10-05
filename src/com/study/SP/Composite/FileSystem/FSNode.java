package com.study.SP.Composite.FileSystem;

public interface FSNode {
    String getName();

    int count();

    long size();

    String tree(String indent);
}
