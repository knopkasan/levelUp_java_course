package ru.levelup.lesson9.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileIO {
    public static void main(String[] args) {
        //InputStream
        //OutputStream
        //Reader
        //Writer

        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)) - чтение с консоли
        //console.close() - закроет System.in поток
        File properties = new File("application.properties");

        try (BufferedReader reader = new BufferedReader(new FileReader(properties))) {
            String line;
            while ( (line = reader.readLine()) != null ) {
                System.out.println(line);
            }
        } catch (IOException exc) {
            System.out.println("Ошибка при чтении файла!");
        }

        /*File properties = new File("application.properties");
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(properties));

            String line;
            while ( (line = reader.readLine()) != null ) {
                System.out.println(line);
            }
        } catch (IOException exc) {
            System.out.println("Ошибка при чтении файла!");
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Невозможно закрыть файл!");
                }
            }
        }*/
    }
}
