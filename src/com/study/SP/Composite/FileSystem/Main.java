package com.study.SP.Composite.FileSystem;

public class Main {
    public static void main(String[] args) {
        Folder root = new Folder("root");
        root.add(new File("README.md", 1024));
        root.add(new File("LICENSE", 512));

        Folder documents = new Folder("documents");
        documents.add(new File("index.html", 2048));
        documents.add(new File("config.txt", 1536));
        root.add(documents);

        // 打印整个目录树
        System.out.println(root.tree(""));
        // + root/
        //   README.md (1024 bytes)
        //   LICENSE (512 bytes)
        //   + documents/
        //     index.html (2048 bytes)
        //     config.txt (1536 bytes)

        // 统一计算文件数和总大小
        System.out.println("Total files: " + root.count()); // Total files: 4
        System.out.println("Total size: " + root.size() + " bytes"); // Total size: 5120 bytes
    }
}