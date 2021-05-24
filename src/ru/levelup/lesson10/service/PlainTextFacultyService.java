package ru.levelup.lesson10.service;

import ru.levelup.lesson10.domain.Faculty;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PlainTextFacultyService implements FacultyService{
    //константа
    private static final String FACULTY_FILE_PATH = "faculties.txt";

    @Override
    public Collection<Faculty> loadFacultyList() {
        try (BufferedReader fileReader =
                     new BufferedReader(new FileReader(FACULTY_FILE_PATH))) {

            String line;
            Collection<Faculty> faculties = new ArrayList<>();
            while ((line = fileReader.readLine()) != null) {
                Faculty faculty = parseRawString(line);
                if (faculty != null) {
                    faculties.add(faculty);
                }
            }

            return faculties;
        } catch (IOException ex) {
            System.out.println("Ошибка при чтении файла " + FACULTY_FILE_PATH);
            return Collections.emptyList();
        }
    }

    @Override
    public Faculty createFaculty(int facultyId, String name) {
        try (BufferedWriter fileWriter =
                     new BufferedWriter(new FileWriter(FACULTY_FILE_PATH, true))) {
            //ID%%NAME
            String line = facultyId + "%%" + name;
            fileWriter.write(line);
            fileWriter.newLine();
            fileWriter.flush();

            return new Faculty(facultyId, name);
        } catch (IOException ex) {
            System.out.println("Ошибка при записи в файл " + FACULTY_FILE_PATH);
            return null;
        }
    }

    private Faculty parseRawString(String rawFacultyString) {
        //ID%%Name
        if (rawFacultyString.trim().isEmpty()) {
            return null;
        }
        String[] elements = rawFacultyString.split("%%");
        return new Faculty(
                Integer.parseInt(elements[0]),
                elements[1]);
    }
}
