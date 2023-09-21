
import java.util.Iterator;
import java.util.List;

        /**
         * Реализация класса итератор для студентов
         */

public class StudentIterator implements Iterator<Student> {
    private int count;
    private List<Student> group;

    public StudentIterator(List<Student> group) {
        this.group = group;
    }

    @Override
    public boolean hasNext() {
        return count < group.size();
    }

    @Override
    public Student next() {
        count++;
        return group.get(count -1);
    }

}
