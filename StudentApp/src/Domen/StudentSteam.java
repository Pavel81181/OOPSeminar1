package Domen;

import java.util.Iterator;
import java.util.List;

/**
 * Создаю класс для обозначения потока студентов, состоящего из итерируемых групп, которые, в свою очередь состоят из студентов.
 */

public class StudentSteam implements Iterable <StudentGroup> {
    private List<StudentGroup> steam;
    private int steamId;

    /**
     * Конструктор класса 
     * @param steam - список групп
     * @param steamId - номер потока
     */
    public StudentSteam(List<StudentGroup> steam, int steamId) {
        this.steam = steam;
        this.steamId = steamId;
    }

    /**
     * @return список групп
     */
    public List<StudentGroup> getSteam() {
        return steam;
    }

    public void setSteam(List<StudentGroup> steam) {
        this.steam = steam;
    }

    public int getSteamId() {
        return steamId;
    }

    public void setSteamId(int steamId) {
        this.steamId = steamId;
    }

    @Override
    public String toString() {
        return "StudenSteam = " + steamId;
    }
        /**
         * Вызов итератора для групп студентов
         */
    @Override
    public Iterator<StudentGroup> iterator() {
        return new StudentGroupIterator(steam);
    }

}
