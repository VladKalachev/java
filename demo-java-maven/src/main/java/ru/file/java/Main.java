package ru.file.java;

import java.io.File;
import java.io.IOException;

/**
 * input/outpute
 */
public class Main {

//    @Test
//    public void testCreateFile() {
//        createFile();
//
//    }

    public static void main(String[] args) throws IOException {
        // File file = new File("example.txt");
   //     File dir = new File(".");
   //     String[] list = dir.list((d, name) -> name.startsWith("."));
//        File[] list = dir.listFiles(f -> f.isDirectory());
//        for(File s: list) {
//            System.out.println(s);
//        }
//        System.out.println(file.createNewFile());
//        System.out.println(file.getTotalSpace());
//        System.out.println(file.delete());
//        System.out.println(new File(".").getName());

        File dir = new File("subfolder/subsub");
        System.out.println(dir.mkdirs());
    }
}
