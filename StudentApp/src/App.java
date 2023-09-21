import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Controllers.AccountContoller;
import Domen.PersonComparator;
import Domen.Student;
import Domen.StudentGroup;
import Domen.StudentSteam;
import Domen.Teacher;

public class App {
    public static void main(String[] args) throws Exception {

        /**
         * Добавляю студентов с именем и возрастом
         */

        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Игорь", 23);
        Student s3 = new Student("Павел", 22);
        Student s4 = new Student("Андрей", 23);
        Student s5 = new Student("Даша", 23);
        Student s6 = new Student("Лена", 23);
        Student s7 = new Student("Алексей", 22);
        Student s8 = new Student("Анна", 21);
        Student s9 = new Student("Дмитрий", 23);
        Student s10 = new Student("Леонид", 24);
        Student s11 = new Student("Ольга", 23);
        Student s12 = new Student("Лариса", 24);

        /**
         * Добавляю студентов в список
         */
        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);

        /**
         * На основании списка создаю группу и присваиваю ей идентификатор
         */
        StudentGroup group5123 = new StudentGroup(listStud, 5123);

        /**
         * Вывод на печать группы и списка студентов
         */

        System.out.println(group5123);
        for (Student s : group5123) {
            System.out.println(s);
        }
        System.out.println();
        System.out.println();

        /**
         * Сортировка студентов в группе по возрасту в соответствии с методом компаратор
         * в классе Студент.
         */
        Collections.sort(group5123.getGroup());

        /**
         * Вывод на печать группы и отсортированного списка студентов
         */

        System.out.println(group5123);

        for (Student s : group5123) {
            System.out.println(s);
        }
        System.out.println();
        System.out.println();

        /**
         * Добавляю студентов во вторую и третью группы
         */
        List<Student> listStud1 = new ArrayList<Student>();
        listStud1.add(s7);
        listStud1.add(s8);
        listStud1.add(s9);
        listStud1.add(s10);
        StudentGroup group5124 = new StudentGroup(listStud1, 5124);

        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s11);
        listStud2.add(s12);
        StudentGroup group5125 = new StudentGroup(listStud2, 5125);

        /**
         * Создаю поток групп студентов, добавляю группы в поток
         */

        List<StudentGroup> listStudGroup = new ArrayList<StudentGroup>();
        listStudGroup.add(group5123);
        listStudGroup.add(group5124);
        listStudGroup.add(group5125);

        StudentSteam steam1 = new StudentSteam(listStudGroup, 1);

        /**
         * Вывод на печать потока и групп, вместе со списком студентов в группах
         * цикл в цикле для вывода номера группы и списка студентов в группе
         */

        System.out.println(steam1);
        System.out.println();

        for (StudentGroup g : steam1) {
            System.out.println(g);

            for (Student s : g) {
                System.out.println(s);
            }
            System.out.println();
        }
        /**
         * Сортировка групп в потоке по возратсанию количества студентов в соответствии
         * с методом компаратор в классе StudentGroup
         */

        Collections.sort(steam1.getSteam());

        /**
         * Вывод на печать отсотрированного потока
         */
        System.out.println("Отсортированный по возрастанию по количеству студентов поток " + steam1);
        System.out.println();

        for (StudentGroup g : steam1) {
            System.out.println(g);
            for (Student s : g) {
                System.out.println(s);
            }
            System.out.println();
        }
        Teacher t1 = new Teacher("Галина", 55, "Docent");
        Teacher t2 = new Teacher("Татьяна", 58, "Docent");
        Teacher t3 = new Teacher("Андрей", 40, "Proff");
        System.out.println(new PersonComparator<Teacher>().compare(t1, t3));
        System.out.println(new PersonComparator<Student>().compare(s1, s2));
        // AccountContoller controller = new AccountContoller();
        // controller.paySalary(t1, 50000);
        // controller.paySalary(s1, 50000);
        AccountContoller.paySalary(t1, 10000);
        /**
         * Вызов метода подсчета среднего возвраста для списка студентов
         */
        
        System.out.println("Средний возраст студентов в группе 5213 = " + AccountContoller.averageAge(listStud));
    }
}
