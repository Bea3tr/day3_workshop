package day3.io;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
        Path p = Paths.get("catinthehat.txt");
        System.out.printf("toString: %s\n", p.toString());

        File f = p.toFile();
        System.out.printf("get absolute path: %s\n", f.getAbsolutePath());
        System.out.printf("get name: %s\n", f.getName());
        System.out.printf("file size: %d\n", f.length());

        // Use File
        // File cat = new File("src/day3_workshop/io/Main.java");
    }
    
}
