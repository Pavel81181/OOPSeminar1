package View;

import java.util.List;
import java.util.Scanner;

import Controller.Interfaces.iGetView;
import Model.Core.Student;
/**
 * Класс view  на английском 
 */

public class ViewClassEng implements iGetView {
    public void printAllStudent(List<Student> students) {
        System.out.println(" ____________STUDENT LIST ________________");
        for (Student s : students) {
            System.out.println(s);

        }
        System.out.println(" ____________END OF STUDENT LIST__________");
    }
    public String promt (String msg)
    {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.nextLine();
    }
}
