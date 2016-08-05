package io;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NioPaths {

    public static void main(String[] args) {
        Path path1 = Paths.get("C:\\workspace_training\\java\\hello.txt");
        
        if(args.length >= 1)
            path1 = Paths.get(args[0]);
        
        System.out.println("Path1: " + path1.toString());
        System.out.println("Path1 getFilename: " + path1.getFileName());
        System.out.println("Path1 getName(0): " + path1.getName(0));
        System.out.println("Path1 getNameCount: " + path1.getNameCount());
        System.out.println("Path1 subpath(0, 2): " + path1.subpath(0, 2));
        System.out.println("Path1 parent: " + path1.getParent().toString());
        System.out.println("Path1 root: " + path1.getRoot().toString());
        System.out.println();
        
        // creates C:/Users/gsmith/Documetns/file.txt (Windows) or /u/gsmith/"Documents"/file.txt (Linux)
        Path path2 = Paths.get(System.getProperty("user.home"), "Documents", "gitignore_global.txt");
        
        System.out.println("Path2: " + path2.toString());
        System.out.println();
        
        // Relative path
        Path path3 = Paths.get("hello.txt");
        System.out.println("Path3: " + path3.toString());
        System.out.println();
        
        // Converting a path
        //  convert to a string that can be opened from a browser
        System.out.println("Path1 URI: " + path1.toUri());
        // convert a relative path to an absoluate path
        System.out.println("Path3 absolute: " + path3.toAbsolutePath());
        
        // Joining two paths
        Path partialPath = Paths.get("C:\\home\\greg\\foo");
        System.out.printf("%s%n", partialPath.resolve("bar"));
    }
}
