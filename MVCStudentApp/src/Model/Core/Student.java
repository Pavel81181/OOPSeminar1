package Model.Core;
public class Student extends Person implements Comparable<Student> {
    private int id;
    private static int generalId;

    public int getId() {
        return id;
    }

    public Student(String name, int age) {
        super(name, age);
        this.id = generalId;
        generalId++;

    }

    @Override 
    public String toString() {
        return "Person = " + super.getName() + " age = " + super.getAge() + " id " + id;
    }

    @Override
    public int compareTo(Student o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    } 
   

}