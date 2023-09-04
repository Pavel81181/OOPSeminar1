package Domen;

import java.util.Iterator;
import java.util.List;

/**
 * Итератор для групп студентов, обеспечивающий возможность итерирования (перехода) по группам внутри потока
 */

public class StudentGroupIterator implements Iterator<StudentGroup> {
    private int count;
    private List<StudentGroup> steam;

    public StudentGroupIterator(List<StudentGroup> steam) {
        this.steam = steam;
    }

    @Override
    public boolean hasNext() {
        return count < steam.size();
    }

    @Override
    public StudentGroup next() {
        count++;
        return steam.get(count -1);
    }

}
