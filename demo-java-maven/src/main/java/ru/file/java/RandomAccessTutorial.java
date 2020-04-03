package ru.file.java;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessTutorial {

    private static final String FILES_TEST_PATH = "file/test.txt";

    /**
     * Метод должен открыть файл RandomAccessFile
     * и записать туда число 10 (тип Integer),
     */
    public void randomAccessWrite() {
        try {
            RandomAccessFile f = new RandomAccessFile(FILES_TEST_PATH, "rw");
            f.writeInt(10);
            f.writeUTF("test line\n");
            f.close();
            System.out.println(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String randomAccessRead() {
        try {
            RandomAccessFile f = new RandomAccessFile(FILES_TEST_PATH, "r");
            f.seek(14);
            String line = f.readLine();
            // log("read line" + line);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
       new RandomAccessTutorial().randomAccessWrite();
    }
}
