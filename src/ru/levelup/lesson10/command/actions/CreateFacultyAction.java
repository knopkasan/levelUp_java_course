package ru.levelup.lesson10.command.actions;

import ru.levelup.lesson10.ConsoleMenuService;
import ru.levelup.lesson10.service.FacultyService;
import ru.levelup.lesson10.service.PlainTextFacultyService;

public class CreateFacultyAction implements Action {

    private final FacultyService facultyService;

    public CreateFacultyAction() {
        this.facultyService = new PlainTextFacultyService();
    }

    @Override
    public void doAction(ConsoleMenuService consoleMenuService) {
        //TODO: Получить значение из консоли
        int facultyId = 1;
        String name = "Факультет";

        facultyService.createFaculty(facultyId, name);
    }
}
