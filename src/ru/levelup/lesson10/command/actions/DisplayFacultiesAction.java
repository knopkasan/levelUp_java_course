package ru.levelup.lesson10.command.actions;

import ru.levelup.lesson10.ConsoleMenuService;
import ru.levelup.lesson10.domain.Faculty;
import ru.levelup.lesson10.service.FacultyService;
import ru.levelup.lesson10.service.PlainTextFacultyService;

import java.util.Collection;

public class DisplayFacultiesAction implements Action {

    private final FacultyService facultyService;

    public DisplayFacultiesAction() {
        this.facultyService = new PlainTextFacultyService();
    }
    @Override
    public void doAction(ConsoleMenuService consoleMenuService) {
        //отображение списка факультетов
        //1. получить список
        //2. отобразить список
        Collection<Faculty> faculties = facultyService.loadFacultyList();
        for (Faculty faculty : faculties) {
            System.out.println(faculty.getFacultyId() + ". Факультет \""
                    + faculty.getName() + "\"");
        }
    }
}
