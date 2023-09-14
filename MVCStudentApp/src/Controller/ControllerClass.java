package Controller;

import java.util.ArrayList;
import java.util.List;

import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.ModelClassList;
import Model.Core.Student;
import View.ViewClass;
import View.ViewClassEng;

public class ControllerClass {
    private iGetModel model;
    private iGetView view;
    private List<Student> students = new ArrayList <Student> ();

    public ControllerClass(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }
    private boolean testData(List<Student> studs) {
        if (studs.size() > 0) {
            return true;
        }
        else 
        {
            return false;
        }
    }
    public void update() {
       //MVP
       students = model.getStudents();
       if (testData(students)) {
        view.printAllStudent(students);
       }
       else {
        System.out.println("Список студентов пуст");
       }
       
        //MVC
        //view.printAllStudent(model.getStudents());
    }
    public void run () {

        Command com =  Command.NONE;
        boolean getNewIter = true;
        while (getNewIter) {
            String comand = view.promt("Введите команду:");
            com = Command.valueOf(comand.toUpperCase());
            switch (com)
            {
                case EXIT:
                getNewIter = false;
                System.out.println("Выход");
                break;
                case LIST:
                view.printAllStudent(model.getStudents());
                break;
            }
        }
    }

    /**
     * Метод ввода и вывода данных для класса ViewClassEng
     */
    public void runEng () {

        Command com =  Command.NONE;
        boolean getNewIter = true;
        while (getNewIter) {
            System.out.println("COMMAND LIST:");
            System.out.println("EXIT - programm exit");
            System.out.println("ADD - add student");
            System.out.println("LIST - print list of students");
            System.out.println("DELETE - delete student:");
            String comand = view.promt("ENTER COMMAND:");

            com = Command.valueOf(comand.toUpperCase());
            switch (com)
            {
                case EXIT:
                getNewIter = false;
                System.out.println("EXIT");
                break;
                case LIST:
                view.printAllStudent(model.getStudents());
                break;
                case ADD:

                case DELETE:

            }
        }
    }
}
