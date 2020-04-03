package ru.file.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Stream
 */
public class FileStreamTutor {

    private static final String FILES_TEST_PATH = "file/test.txt";
    private static final String TEST_LINE = "test line";

    public static void main(String[] args) {
       new FileStreamTutor().writeToFile();
    }

    /**
     * Создаем и пишем в файл
     */
    public void writeToFile() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(FILES_TEST_PATH);
            fileOutputStream.write(TEST_LINE.length());
            byte[] s = TEST_LINE.getBytes();
            fileOutputStream.write(s);
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Считывает строку из файда и возвращяет ее, используя FileInputStream
     */
    public String readFromFile() {
        try {
            FileInputStream fileInputStream = new FileInputStream(FILES_TEST_PATH);
            int i = fileInputStream.read();
            byte[] s = new byte[i];
            fileInputStream.read(s, 0, i);
            String str = new String(s);
            return str;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}
