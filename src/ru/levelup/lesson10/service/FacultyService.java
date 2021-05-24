package ru.levelup.lesson10.service;

import ru.levelup.lesson10.domain.Faculty;

import java.util.Collection;

public interface FacultyService {

    Collection<Faculty> loadFacultyList();

    Faculty createFaculty(int facultyId, String name);


}
