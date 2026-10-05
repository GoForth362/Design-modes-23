package com.study.SP.Composite.FileSystem;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FSNode{
    private final String name;
    private final List<FSNode> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(FSNode node){
        children.add(node);
    }

    public void remove(FSNode node){
        children.remove(node);
    }

    @Override
    public int count() {
        int totalFiles = 0;
        for (FSNode child : children) {
            totalFiles += child.count();
        }
        return totalFiles;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public long size() {
        long totalSize = 0;
        for (FSNode child : children) {
            totalSize += child.size();
        }
        return totalSize;
    }

    @Override
    public String tree(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("+ ").append(name).append("/\n");
        for (FSNode child : children) {
            sb.append(child.tree(indent + "  "));
        }
        return sb.toString();
    }
}
