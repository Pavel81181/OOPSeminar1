package Controllers;

import java.util.List;

import Domen.Person;

public class AccountContoller {
    public static <T extends Person> void paySalary (T person, int salary){
        System.out.println(person.getName() + " выплачено " + salary + "  рублей");

    }
/**
 * Метод подсчета среднего возраста по списку
 * @param <T> дженерик для всего класса Person
 * @param persons список, по которому надо найти средний возраст
 * @return средний возраст списка
 */
   public static <T extends Person> double averageAge (List<T> persons) {
        double sum = 0;
        for (T pers : persons ) {
            sum += pers.getAge();
        }
        return sum/persons.size();
   }
}
