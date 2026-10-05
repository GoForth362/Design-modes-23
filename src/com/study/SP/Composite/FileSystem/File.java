package com.study.SP.Composite.FileSystem;

public class File implements FSNode {
    private final String name;
    private final long size;

    public File(String name, long size) {
        this.name = name;
        this.size = size;
    }
    @Override
    public int count() {
        return 1;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public long size() {
        return size;
    }

    @Override
    public String tree(String indent) {
        return indent + name + " (" + size + " bytes)\n";
    }
}
