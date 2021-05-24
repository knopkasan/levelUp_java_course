package ru.levelup.lesson9;

import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) throws IOException {
        File testFile = new File("test.txt");
        boolean isNull = testFile == null;
        System.out.println("isNull:" + isNull);

        boolean isExist = testFile.exists();
        System.out.println("isExist:" + testFile);

        boolean isCreated = testFile.createNewFile();
        System.out.println("isCreates:" + isCreated);

    }
}
