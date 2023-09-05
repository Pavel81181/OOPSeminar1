package Servises;

import java.util.ArrayList;
import java.util.List;


import Domen.PersonComparator;
import Domen.Teacher;

/**
 * Класс для работы с преподавателями
 */
public class TeacherService implements iPersonService<Teacher> {
    private int count;
    private List<Teacher> teachers;
    public TeacherService() {
        
        this.teachers = new ArrayList<>();
    }
    
    @Override
    public List<Teacher> getAll() {
        return teachers;
    }
    /**
     * Добавление преподавателя
     */
    @Override
    public void create(String name, int age) {
       Teacher teach = new Teacher(name, age, "teacher");
       count++;
       teachers.add(teach);

}
/**
 *  Метод сортировки списка преподавателей по ФИО
 */
public void sortByFio ()
    {
        PersonComparator<Teacher> persComp = new PersonComparator<Teacher>();
        teachers.sort(persComp);
    }
}
