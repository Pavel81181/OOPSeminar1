import java.util.Iterator;
import java.util.List;

public class StudentGroup<T extends Comparable<T>,V extends Number> implements Iterable<Student<T extends Comparable<T>,V extends Number>>, Comparable<StudentGroup> {
    private List<Student> group;
    private int groupId;
    private int numberOfStudents;

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public StudentGroup(List<Student> group, int groupId) {
        this.group = group;
        this.groupId = groupId;
        this.numberOfStudents = group.size();
    }

    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return "StudenGroup = " + groupId;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(group);
    }

    @Override
    public int compareTo(StudentGroup o) {
       
        if (this.getNumberOfStudents() == o.getNumberOfStudents()) {
            return 0;
        } else {
            if (this.getNumberOfStudents() > o.getNumberOfStudents()) {
                return 1;
            } else {
                return -1;
            }
        }

    }

   
}
